package tbclient.FrsPage;

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
/* loaded from: classes9.dex */
public final class PrivateForumShareinfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Integer DEFAULT_CREATE_TIME;
    public static final String DEFAULT_MANAGER_PORTRAIT = "";
    public static final String DEFAULT_MANAGER_USER_NAME = "";
    public static final String DEFAULT_SHARE_URL = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer create_time;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String manager_portrait;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String manager_user_name;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String share_url;

    /* loaded from: classes9.dex */
    public /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public final class Builder extends Message.Builder {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer create_time;
        public String manager_portrait;
        public String manager_user_name;
        public String share_url;

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
        public Builder(PrivateForumShareinfo privateForumShareinfo) {
            super(privateForumShareinfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {privateForumShareinfo};
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
            if (privateForumShareinfo == null) {
                return;
            }
            this.create_time = privateForumShareinfo.create_time;
            this.share_url = privateForumShareinfo.share_url;
            this.manager_user_name = privateForumShareinfo.manager_user_name;
            this.manager_portrait = privateForumShareinfo.manager_portrait;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PrivateForumShareinfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new PrivateForumShareinfo(this, z, null);
            }
            return (PrivateForumShareinfo) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-2042487249, "Ltbclient/FrsPage/PrivateForumShareinfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-2042487249, "Ltbclient/FrsPage/PrivateForumShareinfo;");
                return;
            }
        }
        DEFAULT_CREATE_TIME = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrivateForumShareinfo(Builder builder, boolean z) {
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
            Integer num = builder.create_time;
            if (num == null) {
                this.create_time = DEFAULT_CREATE_TIME;
            } else {
                this.create_time = num;
            }
            String str = builder.share_url;
            if (str == null) {
                this.share_url = "";
            } else {
                this.share_url = str;
            }
            String str2 = builder.manager_user_name;
            if (str2 == null) {
                this.manager_user_name = "";
            } else {
                this.manager_user_name = str2;
            }
            String str3 = builder.manager_portrait;
            if (str3 == null) {
                this.manager_portrait = "";
                return;
            } else {
                this.manager_portrait = str3;
                return;
            }
        }
        this.create_time = builder.create_time;
        this.share_url = builder.share_url;
        this.manager_user_name = builder.manager_user_name;
        this.manager_portrait = builder.manager_portrait;
    }

    public /* synthetic */ PrivateForumShareinfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
