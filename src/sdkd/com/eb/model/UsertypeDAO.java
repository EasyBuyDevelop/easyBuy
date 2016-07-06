package sdkd.com.eb.model;

import java.util.List;
import java.util.Set;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * Usertype entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see sdkd.com.eb.model.Usertype
 * @author MyEclipse Persistence Tools
 */

public class UsertypeDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(UsertypeDAO.class);
	// property constants
	public static final String USER_TYPE_NAME = "userTypeName";

	protected void initDao() {
		// do nothing
	}

	public void save(Usertype transientInstance) {
		log.debug("saving Usertype instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Usertype persistentInstance) {
		log.debug("deleting Usertype instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Usertype findById(java.lang.Integer id) {
		log.debug("getting Usertype instance with id: " + id);
		try {
			Usertype instance = (Usertype) getHibernateTemplate().get(
					"sdkd.com.eb.model.Usertype", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Usertype instance) {
		log.debug("finding Usertype instance by example");
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
		log.debug("finding Usertype instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Usertype as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByUserTypeName(Object userTypeName) {
		return findByProperty(USER_TYPE_NAME, userTypeName);
	}

	public List findAll() {
		log.debug("finding all Usertype instances");
		try {
			String queryString = "from Usertype";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Usertype merge(Usertype detachedInstance) {
		log.debug("merging Usertype instance");
		try {
			Usertype result = (Usertype) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Usertype instance) {
		log.debug("attaching dirty Usertype instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Usertype instance) {
		log.debug("attaching clean Usertype instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static UsertypeDAO getFromApplicationContext(ApplicationContext ctx) {
		return (UsertypeDAO) ctx.getBean("UsertypeDAO");
	}
}