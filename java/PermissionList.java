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
public final class PermissionList extends Message {
    public static /* synthetic */ Interceptable $ic;
    public static final Integer DEFAULT_CHAT;
    public static final Integer DEFAULT_FOLLOW;
    public static final Integer DEFAULT_INTERACT;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer chat;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer follow;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer interact;

    /* loaded from: classes9.dex */
    public /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public final class Builder extends Message.Builder {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer chat;
        public Integer follow;
        public Integer interact;

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
        public Builder(PermissionList permissionList) {
            super(permissionList);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {permissionList};
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
            if (permissionList == null) {
                return;
            }
            this.follow = permissionList.follow;
            this.interact = permissionList.interact;
            this.chat = permissionList.chat;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PermissionList build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new PermissionList(this, z, null);
            }
            return (PermissionList) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(573287588, "Ltbclient/PermissionList;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(573287588, "Ltbclient/PermissionList;");
                return;
            }
        }
        DEFAULT_FOLLOW = 0;
        DEFAULT_INTERACT = 0;
        DEFAULT_CHAT = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PermissionList(Builder builder, boolean z) {
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
            Integer num = builder.follow;
            if (num == null) {
                this.follow = DEFAULT_FOLLOW;
            } else {
                this.follow = num;
            }
            Integer num2 = builder.interact;
            if (num2 == null) {
                this.interact = DEFAULT_INTERACT;
            } else {
                this.interact = num2;
            }
            Integer num3 = builder.chat;
            if (num3 == null) {
                this.chat = DEFAULT_CHAT;
                return;
            } else {
                this.chat = num3;
                return;
            }
        }
        this.follow = builder.follow;
        this.interact = builder.interact;
        this.chat = builder.chat;
    }

    public /* synthetic */ PermissionList(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
