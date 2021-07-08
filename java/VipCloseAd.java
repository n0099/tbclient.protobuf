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
import java.util.Collections;
import java.util.List;
/* loaded from: classes9.dex */
public final class VipCloseAd extends Message {
    public static /* synthetic */ Interceptable $ic;
    public static final List<Integer> DEFAULT_FORUM_CLOSE;
    public static final Integer DEFAULT_IS_OPEN;
    public static final Integer DEFAULT_VIP_CLOSE;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(label = Message.Label.REPEATED, tag = 3, type = Message.Datatype.INT32)
    public final List<Integer> forum_close;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer is_open;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer vip_close;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<VipCloseAd> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public List<Integer> forum_close;
        public Integer is_open;
        public Integer vip_close;

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
        public Builder(VipCloseAd vipCloseAd) {
            super(vipCloseAd);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {vipCloseAd};
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
            if (vipCloseAd == null) {
                return;
            }
            this.is_open = vipCloseAd.is_open;
            this.vip_close = vipCloseAd.vip_close;
            this.forum_close = Message.copyOf(vipCloseAd.forum_close);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public VipCloseAd build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new VipCloseAd(this, z, null) : (VipCloseAd) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(1452969843, "Ltbclient/VipCloseAd;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(1452969843, "Ltbclient/VipCloseAd;");
                return;
            }
        }
        DEFAULT_IS_OPEN = 0;
        DEFAULT_VIP_CLOSE = 0;
        DEFAULT_FORUM_CLOSE = Collections.emptyList();
    }

    public /* synthetic */ VipCloseAd(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VipCloseAd(Builder builder, boolean z) {
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
            Integer num = builder.is_open;
            if (num == null) {
                this.is_open = DEFAULT_IS_OPEN;
            } else {
                this.is_open = num;
            }
            Integer num2 = builder.vip_close;
            if (num2 == null) {
                this.vip_close = DEFAULT_VIP_CLOSE;
            } else {
                this.vip_close = num2;
            }
            List<Integer> list = builder.forum_close;
            if (list == null) {
                this.forum_close = DEFAULT_FORUM_CLOSE;
                return;
            } else {
                this.forum_close = Message.immutableCopyOf(list);
                return;
            }
        }
        this.is_open = builder.is_open;
        this.vip_close = builder.vip_close;
        this.forum_close = Message.immutableCopyOf(builder.forum_close);
    }
}
