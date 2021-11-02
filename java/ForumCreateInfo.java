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
/* loaded from: classes3.dex */
public final class ForumCreateInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_CAN_CREATE_ERRDATA = "";
    public static final Integer DEFAULT_CAN_CREATE_ERRNO;
    public static final Integer DEFAULT_IS_CAN_CREATE;
    public static final Integer DEFAULT_IS_SHOW_CREATE;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String can_create_errdata;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer can_create_errno;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer is_can_create;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer is_show_create;

    /* loaded from: classes3.dex */
    public static final class Builder extends Message.Builder<ForumCreateInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String can_create_errdata;
        public Integer can_create_errno;
        public Integer is_can_create;
        public Integer is_show_create;

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
        public Builder(ForumCreateInfo forumCreateInfo) {
            super(forumCreateInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {forumCreateInfo};
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
            if (forumCreateInfo == null) {
                return;
            }
            this.is_show_create = forumCreateInfo.is_show_create;
            this.is_can_create = forumCreateInfo.is_can_create;
            this.can_create_errno = forumCreateInfo.can_create_errno;
            this.can_create_errdata = forumCreateInfo.can_create_errdata;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ForumCreateInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new ForumCreateInfo(this, z, null) : (ForumCreateInfo) invokeZ.objValue;
        }
    }

    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-255578438, "Ltbclient/ForumCreateInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-255578438, "Ltbclient/ForumCreateInfo;");
                return;
            }
        }
        DEFAULT_IS_SHOW_CREATE = 0;
        DEFAULT_IS_CAN_CREATE = 0;
        DEFAULT_CAN_CREATE_ERRNO = 0;
    }

    public /* synthetic */ ForumCreateInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ForumCreateInfo(Builder builder, boolean z) {
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
            Integer num = builder.is_show_create;
            if (num == null) {
                this.is_show_create = DEFAULT_IS_SHOW_CREATE;
            } else {
                this.is_show_create = num;
            }
            Integer num2 = builder.is_can_create;
            if (num2 == null) {
                this.is_can_create = DEFAULT_IS_CAN_CREATE;
            } else {
                this.is_can_create = num2;
            }
            Integer num3 = builder.can_create_errno;
            if (num3 == null) {
                this.can_create_errno = DEFAULT_CAN_CREATE_ERRNO;
            } else {
                this.can_create_errno = num3;
            }
            String str = builder.can_create_errdata;
            if (str == null) {
                this.can_create_errdata = "";
                return;
            } else {
                this.can_create_errdata = str;
                return;
            }
        }
        this.is_show_create = builder.is_show_create;
        this.is_can_create = builder.is_can_create;
        this.can_create_errno = builder.can_create_errno;
        this.can_create_errdata = builder.can_create_errdata;
    }
}
