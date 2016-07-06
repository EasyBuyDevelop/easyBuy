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
 * Orderstate entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see sdkd.com.eb.model.Orderstate
 * @author MyEclipse Persistence Tools
 */

public class OrderstateDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(OrderstateDAO.class);
	// property constants
	public static final String STATE_NAME = "stateName";

	protected void initDao() {
		// do nothing
	}

	public void save(Orderstate transientInstance) {
		log.debug("saving Orderstate instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Orderstate persistentInstance) {
		log.debug("deleting Orderstate instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Orderstate findById(java.lang.Integer id) {
		log.debug("getting Orderstate instance with id: " + id);
		try {
			Orderstate instance = (Orderstate) getHibernateTemplate().get(
					"sdkd.com.eb.model.Orderstate", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Orderstate instance) {
		log.debug("finding Orderstate instance by example");
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
		log.debug("finding Orderstate instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Orderstate as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByStateName(Object stateName) {
		return findByProperty(STATE_NAME, stateName);
	}

	public List findAll() {
		log.debug("finding all Orderstate instances");
		try {
			String queryString = "from Orderstate";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Orderstate merge(Orderstate detachedInstance) {
		log.debug("merging Orderstate instance");
		try {
			Orderstate result = (Orderstate) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Orderstate instance) {
		log.debug("attaching dirty Orderstate instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Orderstate instance) {
		log.debug("attaching clean Orderstate instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static OrderstateDAO getFromApplicationContext(ApplicationContext ctx) {
		return (OrderstateDAO) ctx.getBean("OrderstateDAO");
	}
}