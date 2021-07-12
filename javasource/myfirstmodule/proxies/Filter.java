// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies;

public class Filter
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject filterMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MyFirstModule.Filter";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		FirstName("FirstName"),
		LastName("LastName"),
		DateOfBirth("DateOfBirth");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public Filter(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "MyFirstModule.Filter"));
	}

	protected Filter(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject filterMendixObject)
	{
		if (filterMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("MyFirstModule.Filter", filterMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a MyFirstModule.Filter");

		this.filterMendixObject = filterMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Filter.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static myfirstmodule.proxies.Filter initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return myfirstmodule.proxies.Filter.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static myfirstmodule.proxies.Filter initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new myfirstmodule.proxies.Filter(context, mendixObject);
	}

	public static myfirstmodule.proxies.Filter load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return myfirstmodule.proxies.Filter.initialize(context, mendixObject);
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of FirstName
	 */
	public final java.lang.String getFirstName()
	{
		return getFirstName(getContext());
	}

	/**
	 * @param context
	 * @return value of FirstName
	 */
	public final java.lang.String getFirstName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.FirstName.toString());
	}

	/**
	 * Set value of FirstName
	 * @param firstname
	 */
	public final void setFirstName(java.lang.String firstname)
	{
		setFirstName(getContext(), firstname);
	}

	/**
	 * Set value of FirstName
	 * @param context
	 * @param firstname
	 */
	public final void setFirstName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String firstname)
	{
		getMendixObject().setValue(context, MemberNames.FirstName.toString(), firstname);
	}

	/**
	 * @return value of LastName
	 */
	public final java.lang.String getLastName()
	{
		return getLastName(getContext());
	}

	/**
	 * @param context
	 * @return value of LastName
	 */
	public final java.lang.String getLastName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.LastName.toString());
	}

	/**
	 * Set value of LastName
	 * @param lastname
	 */
	public final void setLastName(java.lang.String lastname)
	{
		setLastName(getContext(), lastname);
	}

	/**
	 * Set value of LastName
	 * @param context
	 * @param lastname
	 */
	public final void setLastName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String lastname)
	{
		getMendixObject().setValue(context, MemberNames.LastName.toString(), lastname);
	}

	/**
	 * @return value of DateOfBirth
	 */
	public final java.util.Date getDateOfBirth()
	{
		return getDateOfBirth(getContext());
	}

	/**
	 * @param context
	 * @return value of DateOfBirth
	 */
	public final java.util.Date getDateOfBirth(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.DateOfBirth.toString());
	}

	/**
	 * Set value of DateOfBirth
	 * @param dateofbirth
	 */
	public final void setDateOfBirth(java.util.Date dateofbirth)
	{
		setDateOfBirth(getContext(), dateofbirth);
	}

	/**
	 * Set value of DateOfBirth
	 * @param context
	 * @param dateofbirth
	 */
	public final void setDateOfBirth(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date dateofbirth)
	{
		getMendixObject().setValue(context, MemberNames.DateOfBirth.toString(), dateofbirth);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return filterMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final myfirstmodule.proxies.Filter that = (myfirstmodule.proxies.Filter) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "MyFirstModule.Filter";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
