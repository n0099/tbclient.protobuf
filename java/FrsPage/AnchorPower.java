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
public final class AnchorPower extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_ANCHOR_MESSAGE = "";
    public static final Integer DEFAULT_CAN_ADD_LIVE_POST;
    public static final String DEFAULT_CAN_ADD_LIVE_POST_MSG = "";
    public static final Integer DEFAULT_CAN_DEL_LIVE_POST;
    public static final Integer DEFAULT_HAVE_POWER;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String anchor_message;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer can_add_live_post;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String can_add_live_post_msg;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer can_del_live_post;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer have_power;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<AnchorPower> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String anchor_message;
        public Integer can_add_live_post;
        public String can_add_live_post_msg;
        public Integer can_del_live_post;
        public Integer have_power;

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
        public Builder(AnchorPower anchorPower) {
            super(anchorPower);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {anchorPower};
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
            if (anchorPower == null) {
                return;
            }
            this.have_power = anchorPower.have_power;
            this.anchor_message = anchorPower.anchor_message;
            this.can_add_live_post = anchorPower.can_add_live_post;
            this.can_del_live_post = anchorPower.can_del_live_post;
            this.can_add_live_post_msg = anchorPower.can_add_live_post_msg;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AnchorPower build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new AnchorPower(this, z, null) : (AnchorPower) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-1755581426, "Ltbclient/FrsPage/AnchorPower;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-1755581426, "Ltbclient/FrsPage/AnchorPower;");
                return;
            }
        }
        DEFAULT_HAVE_POWER = 0;
        DEFAULT_CAN_ADD_LIVE_POST = 0;
        DEFAULT_CAN_DEL_LIVE_POST = 0;
    }

    public /* synthetic */ AnchorPower(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchorPower(Builder builder, boolean z) {
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
            Integer num = builder.have_power;
            if (num == null) {
                this.have_power = DEFAULT_HAVE_POWER;
            } else {
                this.have_power = num;
            }
            String str = builder.anchor_message;
            if (str == null) {
                this.anchor_message = "";
            } else {
                this.anchor_message = str;
            }
            Integer num2 = builder.can_add_live_post;
            if (num2 == null) {
                this.can_add_live_post = DEFAULT_CAN_ADD_LIVE_POST;
            } else {
                this.can_add_live_post = num2;
            }
            Integer num3 = builder.can_del_live_post;
            if (num3 == null) {
                this.can_del_live_post = DEFAULT_CAN_DEL_LIVE_POST;
            } else {
                this.can_del_live_post = num3;
            }
            String str2 = builder.can_add_live_post_msg;
            if (str2 == null) {
                this.can_add_live_post_msg = "";
                return;
            } else {
                this.can_add_live_post_msg = str2;
                return;
            }
        }
        this.have_power = builder.have_power;
        this.anchor_message = builder.anchor_message;
        this.can_add_live_post = builder.can_add_live_post;
        this.can_del_live_post = builder.can_del_live_post;
        this.can_add_live_post_msg = builder.can_add_live_post_msg;
    }
}
