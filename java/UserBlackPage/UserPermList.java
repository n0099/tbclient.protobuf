package tbclient.UserBlackPage;

import com.baidu.android.imsdk.internal.Constants;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InitContext;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.baidu.titan.sdk.runtime.TitanRuntime;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.PermissionList;
/* loaded from: classes8.dex */
public final class UserPermList extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_NAME_SHOW = "";
    public static final String DEFAULT_PORTRAIT = "";
    public static final Long DEFAULT_UID;
    public static final String DEFAULT_USER_NAME = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String name_show;
    @ProtoField(tag = 2)
    public final PermissionList perm_list;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String portrait;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long uid;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String user_name;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<UserPermList> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String name_show;
        public PermissionList perm_list;
        public String portrait;
        public Long uid;
        public String user_name;

        public Builder() {
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                interceptable.invokeUnInit(65536, newInitContext);
                int i = newInitContext.flag;
                if ((i & 1) != 0) {
                    int i2 = i & 2;
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65536, newInitContext);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(UserPermList userPermList) {
            super(userPermList);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {userPermList};
                interceptable.invokeUnInit(65537, newInitContext);
                int i = newInitContext.flag;
                if ((i & 1) != 0) {
                    int i2 = i & 2;
                    super((Message) newInitContext.callArgs[0]);
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65537, newInitContext);
                    return;
                }
            }
            if (userPermList == null) {
                return;
            }
            this.uid = userPermList.uid;
            this.perm_list = userPermList.perm_list;
            this.user_name = userPermList.user_name;
            this.name_show = userPermList.name_show;
            this.portrait = userPermList.portrait;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public UserPermList build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new UserPermList(this, z, null) : (UserPermList) invokeZ.objValue;
        }
    }

    /* loaded from: classes8.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-743410164, "Ltbclient/UserBlackPage/UserPermList;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-743410164, "Ltbclient/UserBlackPage/UserPermList;");
                return;
            }
        }
        DEFAULT_UID = 0L;
    }

    public /* synthetic */ UserPermList(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserPermList(Builder builder, boolean z) {
        super(builder);
        Interceptable interceptable = $ic;
        if (interceptable != null) {
            InitContext newInitContext = TitanRuntime.newInitContext();
            newInitContext.initArgs = r2;
            Object[] objArr = {builder, Boolean.valueOf(z)};
            interceptable.invokeUnInit(65537, newInitContext);
            int i = newInitContext.flag;
            if ((i & 1) != 0) {
                int i2 = i & 2;
                super((Message.Builder) newInitContext.callArgs[0]);
                newInitContext.thisArg = this;
                interceptable.invokeInitBody(65537, newInitContext);
                return;
            }
        }
        if (z) {
            Long l = builder.uid;
            if (l == null) {
                this.uid = DEFAULT_UID;
            } else {
                this.uid = l;
            }
            this.perm_list = builder.perm_list;
            String str = builder.user_name;
            if (str == null) {
                this.user_name = "";
            } else {
                this.user_name = str;
            }
            String str2 = builder.name_show;
            if (str2 == null) {
                this.name_show = "";
            } else {
                this.name_show = str2;
            }
            String str3 = builder.portrait;
            if (str3 == null) {
                this.portrait = "";
                return;
            } else {
                this.portrait = str3;
                return;
            }
        }
        this.uid = builder.uid;
        this.perm_list = builder.perm_list;
        this.user_name = builder.user_name;
        this.name_show = builder.name_show;
        this.portrait = builder.portrait;
    }
}