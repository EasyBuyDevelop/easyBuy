package sdkd.com.eb.model;

import java.sql.Timestamp;
import java.util.List;
import java.util.Set;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * Orderform entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see sdkd.com.eb.model.Orderform
 * @author MyEclipse Persistence Tools
 */

public class OrderformDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(OrderformDAO.class);
	// property constants
	public static final String ORDER_RECEIVER_NAME = "orderReceiverName";
	public static final String ORDER_RECEIVER_ADD = "orderReceiverAdd";
	public static final String ORDER_MONEY = "orderMoney";

	protected void initDao() {
		// do nothing
	}

	public void save(Orderform transientInstance) {
		log.debug("saving Orderform instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Orderform persistentInstance) {
		log.debug("deleting Orderform instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Orderform findById(java.lang.Integer id) {
		log.debug("getting Orderform instance with id: " + id);
		try {
			Orderform instance = (Orderform) getHibernateTemplate().get(
					"sdkd.com.eb.model.Orderform", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Orderform instance) {
		log.debug("finding Orderform instance by example");
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
		log.debug("finding Orderform instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Orderform as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByOrderReceiverName(Object orderReceiverName) {
		return findByProperty(ORDER_RECEIVER_NAME, orderReceiverName);
	}

	public List findByOrderReceiverAdd(Object orderReceiverAdd) {
		return findByProperty(ORDER_RECEIVER_ADD, orderReceiverAdd);
	}

	public List findByOrderMoney(Object orderMoney) {
		return findByProperty(ORDER_MONEY, orderMoney);
	}

	public List findAll() {
		log.debug("finding all Orderform instances");
		try {
			String queryString = "from Orderform";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Orderform merge(Orderform detachedInstance) {
		log.debug("merging Orderform instance");
		try {
			Orderform result = (Orderform) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Orderform instance) {
		log.debug("attaching dirty Orderform instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Orderform instance) {
		log.debug("attaching clean Orderform instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static OrderformDAO getFromApplicationContext(ApplicationContext ctx) {
		return (OrderformDAO) ctx.getBean("OrderformDAO");
	}
}