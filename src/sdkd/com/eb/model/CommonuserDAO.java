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
 * Commonuser entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see sdkd.com.eb.model.Commonuser
 * @author MyEclipse Persistence Tools
 */

public class CommonuserDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(CommonuserDAO.class);
	// property constants
	public static final String USER_TYPE_ID = "userTypeId";
	public static final String LOGIN_NAME = "loginName";
	public static final String USER_TEL = "userTel";
	public static final String USER_ADD = "userAdd";
	public static final String PASSWORD = "password";
	public static final String IDCARD = "idcard";
	public static final String EMAIL = "email";
	public static final String VIPUSER_NAME = "vipuserName";

	protected void initDao() {
		// do nothing
	}

	public void save(Commonuser transientInstance) {
		log.debug("saving Commonuser instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Commonuser persistentInstance) {
		log.debug("deleting Commonuser instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Commonuser findById(java.lang.Integer id) {
		log.debug("getting Commonuser instance with id: " + id);
		try {
			Commonuser instance = (Commonuser) getHibernateTemplate().get(
					"sdkd.com.eb.model.Commonuser", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Commonuser instance) {
		log.debug("finding Commonuser instance by example");
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
		log.debug("finding Commonuser instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Commonuser as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByUserTypeId(Object userTypeId) {
		return findByProperty(USER_TYPE_ID, userTypeId);
	}

	public List findByLoginName(Object loginName) {
		return findByProperty(LOGIN_NAME, loginName);
	}

	public List findByUserTel(Object userTel) {
		return findByProperty(USER_TEL, userTel);
	}

	public List findByUserAdd(Object userAdd) {
		return findByProperty(USER_ADD, userAdd);
	}

	public List findByPassword(Object password) {
		return findByProperty(PASSWORD, password);
	}

	public List findByIdcard(Object idcard) {
		return findByProperty(IDCARD, idcard);
	}

	public List findByEmail(Object email) {
		return findByProperty(EMAIL, email);
	}

	public List findByVipuserName(Object vipuserName) {
		return findByProperty(VIPUSER_NAME, vipuserName);
	}

	public List findAll() {
		log.debug("finding all Commonuser instances");
		try {
			String queryString = "from Commonuser";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Commonuser merge(Commonuser detachedInstance) {
		log.debug("merging Commonuser instance");
		try {
			Commonuser result = (Commonuser) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Commonuser instance) {
		log.debug("attaching dirty Commonuser instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Commonuser instance) {
		log.debug("attaching clean Commonuser instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static CommonuserDAO getFromApplicationContext(ApplicationContext ctx) {
		return (CommonuserDAO) ctx.getBean("CommonuserDAO");
	}
}