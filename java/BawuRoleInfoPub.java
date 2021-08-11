package tbclient;

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
/* loaded from: classes2.dex */
public final class BawuRoleInfoPub extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Long DEFAULT_FORUM_ID;
    public static final String DEFAULT_LEVEL_NAME = "";
    public static final String DEFAULT_NAME_SHOW = "";
    public static final String DEFAULT_PORTRAIT = "";
    public static final Integer DEFAULT_ROLE_ID;
    public static final String DEFAULT_ROLE_NAME = "";
    public static final Long DEFAULT_USER_ID;
    public static final Integer DEFAULT_USER_LEVEL;
    public static final String DEFAULT_USER_NAME = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 10)
    public final BaijiahaoInfo baijiahao_info;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long forum_id;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String level_name;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String name_show;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String portrait;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer role_id;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String role_name;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long user_id;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer user_level;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String user_name;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<BawuRoleInfoPub> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public BaijiahaoInfo baijiahao_info;
        public Long forum_id;
        public String level_name;
        public String name_show;
        public String portrait;
        public Integer role_id;
        public String role_name;
        public Long user_id;
        public Integer user_level;
        public String user_name;

        public Builder() {
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                interceptable.invokeUnInit(65536, newInitContext);
                int i2 = newInitContext.flag;
                if ((i2 & 1) != 0) {
                    int i3 = i2 & 2;
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65536, newInitContext);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(BawuRoleInfoPub bawuRoleInfoPub) {
            super(bawuRoleInfoPub);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {bawuRoleInfoPub};
                interceptable.invokeUnInit(65537, newInitContext);
                int i2 = newInitContext.flag;
                if ((i2 & 1) != 0) {
                    int i3 = i2 & 2;
                    super((Message) newInitContext.callArgs[0]);
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65537, newInitContext);
                    return;
                }
            }
            if (bawuRoleInfoPub == null) {
                return;
            }
            this.forum_id = bawuRoleInfoPub.forum_id;
            this.user_id = bawuRoleInfoPub.user_id;
            this.role_id = bawuRoleInfoPub.role_id;
            this.role_name = bawuRoleInfoPub.role_name;
            this.portrait = bawuRoleInfoPub.portrait;
            this.user_level = bawuRoleInfoPub.user_level;
            this.level_name = bawuRoleInfoPub.level_name;
            this.user_name = bawuRoleInfoPub.user_name;
            this.name_show = bawuRoleInfoPub.name_show;
            this.baijiahao_info = bawuRoleInfoPub.baijiahao_info;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public BawuRoleInfoPub build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new BawuRoleInfoPub(this, z, null) : (BawuRoleInfoPub) invokeZ.objValue;
        }
    }

    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(15256105, "Ltbclient/BawuRoleInfoPub;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(15256105, "Ltbclient/BawuRoleInfoPub;");
                return;
            }
        }
        DEFAULT_FORUM_ID = 0L;
        DEFAULT_USER_ID = 0L;
        DEFAULT_ROLE_ID = 0;
        DEFAULT_USER_LEVEL = 0;
    }

    public /* synthetic */ BawuRoleInfoPub(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BawuRoleInfoPub(Builder builder, boolean z) {
        super(builder);
        Interceptable interceptable = $ic;
        if (interceptable != null) {
            InitContext newInitContext = TitanRuntime.newInitContext();
            newInitContext.initArgs = r2;
            Object[] objArr = {builder, Boolean.valueOf(z)};
            interceptable.invokeUnInit(65537, newInitContext);
            int i2 = newInitContext.flag;
            if ((i2 & 1) != 0) {
                int i3 = i2 & 2;
                super((Message.Builder) newInitContext.callArgs[0]);
                newInitContext.thisArg = this;
                interceptable.invokeInitBody(65537, newInitContext);
                return;
            }
        }
        if (z) {
            Long l = builder.forum_id;
            if (l == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = l;
            }
            Long l2 = builder.user_id;
            if (l2 == null) {
                this.user_id = DEFAULT_USER_ID;
            } else {
                this.user_id = l2;
            }
            Integer num = builder.role_id;
            if (num == null) {
                this.role_id = DEFAULT_ROLE_ID;
            } else {
                this.role_id = num;
            }
            String str = builder.role_name;
            if (str == null) {
                this.role_name = "";
            } else {
                this.role_name = str;
            }
            String str2 = builder.portrait;
            if (str2 == null) {
                this.portrait = "";
            } else {
                this.portrait = str2;
            }
            Integer num2 = builder.user_level;
            if (num2 == null) {
                this.user_level = DEFAULT_USER_LEVEL;
            } else {
                this.user_level = num2;
            }
            String str3 = builder.level_name;
            if (str3 == null) {
                this.level_name = "";
            } else {
                this.level_name = str3;
            }
            String str4 = builder.user_name;
            if (str4 == null) {
                this.user_name = "";
            } else {
                this.user_name = str4;
            }
            String str5 = builder.name_show;
            if (str5 == null) {
                this.name_show = "";
            } else {
                this.name_show = str5;
            }
            this.baijiahao_info = builder.baijiahao_info;
            return;
        }
        this.forum_id = builder.forum_id;
        this.user_id = builder.user_id;
        this.role_id = builder.role_id;
        this.role_name = builder.role_name;
        this.portrait = builder.portrait;
        this.user_level = builder.user_level;
        this.level_name = builder.level_name;
        this.user_name = builder.user_name;
        this.name_show = builder.name_show;
        this.baijiahao_info = builder.baijiahao_info;
    }
}
