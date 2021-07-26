package tbclient.ItemPage;

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
import tbclient.CommonReq;
/* loaded from: classes9.dex */
public final class DataReq extends Message {
    public static /* synthetic */ Interceptable $ic;
    public static final Integer DEFAULT_ITEM_ID;
    public static final Integer DEFAULT_Q_TYPE;
    public static final Integer DEFAULT_SCR_DIP;
    public static final Integer DEFAULT_SCR_H;
    public static final Integer DEFAULT_SCR_W;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f74038common;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer item_id;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer q_type;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer scr_dip;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer scr_h;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer scr_w;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f74039common;
        public Integer item_id;
        public Integer q_type;
        public Integer scr_dip;
        public Integer scr_h;
        public Integer scr_w;

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
        public Builder(DataReq dataReq) {
            super(dataReq);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {dataReq};
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
            if (dataReq == null) {
                return;
            }
            this.f74039common = dataReq.f74038common;
            this.item_id = dataReq.item_id;
            this.scr_w = dataReq.scr_w;
            this.scr_h = dataReq.scr_h;
            this.scr_dip = dataReq.scr_dip;
            this.q_type = dataReq.q_type;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new DataReq(this, z, null) : (DataReq) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(1679610314, "Ltbclient/ItemPage/DataReq;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(1679610314, "Ltbclient/ItemPage/DataReq;");
                return;
            }
        }
        DEFAULT_ITEM_ID = 0;
        DEFAULT_SCR_W = 0;
        DEFAULT_SCR_H = 0;
        DEFAULT_SCR_DIP = 0;
        DEFAULT_Q_TYPE = 0;
    }

    public /* synthetic */ DataReq(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataReq(Builder builder, boolean z) {
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
            this.f74038common = builder.f74039common;
            Integer num = builder.item_id;
            if (num == null) {
                this.item_id = DEFAULT_ITEM_ID;
            } else {
                this.item_id = num;
            }
            Integer num2 = builder.scr_w;
            if (num2 == null) {
                this.scr_w = DEFAULT_SCR_W;
            } else {
                this.scr_w = num2;
            }
            Integer num3 = builder.scr_h;
            if (num3 == null) {
                this.scr_h = DEFAULT_SCR_H;
            } else {
                this.scr_h = num3;
            }
            Integer num4 = builder.scr_dip;
            if (num4 == null) {
                this.scr_dip = DEFAULT_SCR_DIP;
            } else {
                this.scr_dip = num4;
            }
            Integer num5 = builder.q_type;
            if (num5 == null) {
                this.q_type = DEFAULT_Q_TYPE;
                return;
            } else {
                this.q_type = num5;
                return;
            }
        }
        this.f74038common = builder.f74039common;
        this.item_id = builder.item_id;
        this.scr_w = builder.scr_w;
        this.scr_h = builder.scr_h;
        this.scr_dip = builder.scr_dip;
        this.q_type = builder.q_type;
    }
}
