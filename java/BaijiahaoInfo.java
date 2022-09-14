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
/* loaded from: classes9.dex */
public final class BaijiahaoInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_AUTH_DESC = "";
    public static final Integer DEFAULT_AUTH_ID;
    public static final String DEFAULT_AVATAR = "";
    public static final String DEFAULT_AVATAR_H = "";
    public static final String DEFAULT_BRIEF = "";
    public static final Integer DEFAULT_CAN_MODIFY_AVATAR;
    public static final String DEFAULT_NAME = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String auth_desc;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer auth_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String avatar;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String avatar_h;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String brief;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer can_modify_avatar;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String name;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<BaijiahaoInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String auth_desc;
        public Integer auth_id;
        public String avatar;
        public String avatar_h;
        public String brief;
        public Integer can_modify_avatar;
        public String name;

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
        public Builder(BaijiahaoInfo baijiahaoInfo) {
            super(baijiahaoInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {baijiahaoInfo};
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
            if (baijiahaoInfo == null) {
                return;
            }
            this.name = baijiahaoInfo.name;
            this.avatar = baijiahaoInfo.avatar;
            this.avatar_h = baijiahaoInfo.avatar_h;
            this.brief = baijiahaoInfo.brief;
            this.auth_id = baijiahaoInfo.auth_id;
            this.auth_desc = baijiahaoInfo.auth_desc;
            this.can_modify_avatar = baijiahaoInfo.can_modify_avatar;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public BaijiahaoInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new BaijiahaoInfo(this, z, null) : (BaijiahaoInfo) invokeZ.objValue;
        }
    }

    /* loaded from: classes9.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-1775892871, "Ltbclient/BaijiahaoInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-1775892871, "Ltbclient/BaijiahaoInfo;");
                return;
            }
        }
        DEFAULT_AUTH_ID = 0;
        DEFAULT_CAN_MODIFY_AVATAR = 0;
    }

    public /* synthetic */ BaijiahaoInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaijiahaoInfo(Builder builder, boolean z) {
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
            String str = builder.name;
            if (str == null) {
                this.name = "";
            } else {
                this.name = str;
            }
            String str2 = builder.avatar;
            if (str2 == null) {
                this.avatar = "";
            } else {
                this.avatar = str2;
            }
            String str3 = builder.avatar_h;
            if (str3 == null) {
                this.avatar_h = "";
            } else {
                this.avatar_h = str3;
            }
            String str4 = builder.brief;
            if (str4 == null) {
                this.brief = "";
            } else {
                this.brief = str4;
            }
            Integer num = builder.auth_id;
            if (num == null) {
                this.auth_id = DEFAULT_AUTH_ID;
            } else {
                this.auth_id = num;
            }
            String str5 = builder.auth_desc;
            if (str5 == null) {
                this.auth_desc = "";
            } else {
                this.auth_desc = str5;
            }
            Integer num2 = builder.can_modify_avatar;
            if (num2 == null) {
                this.can_modify_avatar = DEFAULT_CAN_MODIFY_AVATAR;
                return;
            } else {
                this.can_modify_avatar = num2;
                return;
            }
        }
        this.name = builder.name;
        this.avatar = builder.avatar;
        this.avatar_h = builder.avatar_h;
        this.brief = builder.brief;
        this.auth_id = builder.auth_id;
        this.auth_desc = builder.auth_desc;
        this.can_modify_avatar = builder.can_modify_avatar;
    }
}
