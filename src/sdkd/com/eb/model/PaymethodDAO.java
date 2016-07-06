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
 * Paymethod entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see sdkd.com.eb.model.Paymethod
 * @author MyEclipse Persistence Tools
 */

public class PaymethodDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(PaymethodDAO.class);
	// property constants
	public static final String PAY_NAME = "payName";

	protected void initDao() {
		// do nothing
	}

	public void save(Paymethod transientInstance) {
		log.debug("saving Paymethod instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Paymethod persistentInstance) {
		log.debug("deleting Paymethod instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Paymethod findById(java.lang.Integer id) {
		log.debug("getting Paymethod instance with id: " + id);
		try {
			Paymethod instance = (Paymethod) getHibernateTemplate().get(
					"sdkd.com.eb.model.Paymethod", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Paymethod instance) {
		log.debug("finding Paymethod instance by example");
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
		log.debug("finding Paymethod instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Paymethod as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByPayName(Object payName) {
		return findByProperty(PAY_NAME, payName);
	}

	public List findAll() {
		log.debug("finding all Paymethod instances");
		try {
			String queryString = "from Paymethod";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Paymethod merge(Paymethod detachedInstance) {
		log.debug("merging Paymethod instance");
		try {
			Paymethod result = (Paymethod) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Paymethod instance) {
		log.debug("attaching dirty Paymethod instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Paymethod instance) {
		log.debug("attaching clean Paymethod instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static PaymethodDAO getFromApplicationContext(ApplicationContext ctx) {
		return (PaymethodDAO) ctx.getBean("PaymethodDAO");
	}
}