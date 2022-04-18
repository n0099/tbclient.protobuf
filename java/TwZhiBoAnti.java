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
public final class TwZhiBoAnti extends Message {
    public static /* synthetic */ Interceptable $ic;
    public static final Integer DEFAULT_CAN_ADD_LIVE_POST;
    public static final Integer DEFAULT_CAN_DEL_LIVE_POST;
    public static final Integer DEFAULT_CAN_SHOW_PB_HEADLINE;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer can_add_live_post;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer can_del_live_post;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer can_show_pb_headline;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<TwZhiBoAnti> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer can_add_live_post;
        public Integer can_del_live_post;
        public Integer can_show_pb_headline;

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
        public Builder(TwZhiBoAnti twZhiBoAnti) {
            super(twZhiBoAnti);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {twZhiBoAnti};
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
            if (twZhiBoAnti == null) {
                return;
            }
            this.can_add_live_post = twZhiBoAnti.can_add_live_post;
            this.can_del_live_post = twZhiBoAnti.can_del_live_post;
            this.can_show_pb_headline = twZhiBoAnti.can_show_pb_headline;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public TwZhiBoAnti build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new TwZhiBoAnti(this, z, null) : (TwZhiBoAnti) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(1955873310, "Ltbclient/TwZhiBoAnti;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(1955873310, "Ltbclient/TwZhiBoAnti;");
                return;
            }
        }
        DEFAULT_CAN_ADD_LIVE_POST = 0;
        DEFAULT_CAN_DEL_LIVE_POST = 0;
        DEFAULT_CAN_SHOW_PB_HEADLINE = 0;
    }

    public /* synthetic */ TwZhiBoAnti(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TwZhiBoAnti(Builder builder, boolean z) {
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
            Integer num = builder.can_add_live_post;
            if (num == null) {
                this.can_add_live_post = DEFAULT_CAN_ADD_LIVE_POST;
            } else {
                this.can_add_live_post = num;
            }
            Integer num2 = builder.can_del_live_post;
            if (num2 == null) {
                this.can_del_live_post = DEFAULT_CAN_DEL_LIVE_POST;
            } else {
                this.can_del_live_post = num2;
            }
            Integer num3 = builder.can_show_pb_headline;
            if (num3 == null) {
                this.can_show_pb_headline = DEFAULT_CAN_SHOW_PB_HEADLINE;
                return;
            } else {
                this.can_show_pb_headline = num3;
                return;
            }
        }
        this.can_add_live_post = builder.can_add_live_post;
        this.can_del_live_post = builder.can_del_live_post;
        this.can_show_pb_headline = builder.can_show_pb_headline;
    }
}
