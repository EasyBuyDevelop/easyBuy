package sdkd.com.eb.model;

import java.util.List;
import java.util.Set;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for Sex
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see sdkd.com.eb.model.Sex
 * @author MyEclipse Persistence Tools
 */

public class SexDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory.getLogger(SexDAO.class);
	// property constants
	public static final String SEX_NAME = "sexName";

	protected void initDao() {
		// do nothing
	}

	public void save(Sex transientInstance) {
		log.debug("saving Sex instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Sex persistentInstance) {
		log.debug("deleting Sex instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Sex findById(java.lang.Integer id) {
		log.debug("getting Sex instance with id: " + id);
		try {
			Sex instance = (Sex) getHibernateTemplate().get(
					"sdkd.com.eb.model.Sex", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Sex instance) {
		log.debug("finding Sex instance by example");
		try {
			List results = getHibernateTemplate().findByExample(instance);
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Sex instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Sex as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findBySexName(Object sexName) {
		return findByProperty(SEX_NAME, sexName);
	}

	public List findAll() {
		log.debug("finding all Sex instances");
		try {
			String queryString = "from Sex";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Sex merge(Sex detachedInstance) {
		log.debug("merging Sex instance");
		try {
			Sex result = (Sex) getHibernateTemplate().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Sex instance) {
		log.debug("attaching dirty Sex instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Sex instance) {
		log.debug("attaching clean Sex instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static SexDAO getFromApplicationContext(ApplicationContext ctx) {
		return (SexDAO) ctx.getBean("SexDAO");
	}
}