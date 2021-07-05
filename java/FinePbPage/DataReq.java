package tbclient.FinePbPage;

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
/* loaded from: classes10.dex */
public final class DataReq extends Message {
    public static /* synthetic */ Interceptable $ic;
    public static final Long DEFAULT_FTID;
    public static final Long DEFAULT_Q_TYPE;
    public static final Long DEFAULT_SCR_DIP;
    public static final Long DEFAULT_SCR_H;
    public static final Long DEFAULT_SCR_W;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f76374common;
    @ProtoField(tag = 6, type = Message.Datatype.UINT64)
    public final Long ftid;
    @ProtoField(tag = 5, type = Message.Datatype.UINT64)
    public final Long q_type;
    @ProtoField(tag = 4, type = Message.Datatype.UINT64)
    public final Long scr_dip;
    @ProtoField(tag = 3, type = Message.Datatype.UINT64)
    public final Long scr_h;
    @ProtoField(tag = 2, type = Message.Datatype.UINT64)
    public final Long scr_w;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f76375common;
        public Long ftid;
        public Long q_type;
        public Long scr_dip;
        public Long scr_h;
        public Long scr_w;

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
            this.f76375common = dataReq.f76374common;
            this.scr_w = dataReq.scr_w;
            this.scr_h = dataReq.scr_h;
            this.scr_dip = dataReq.scr_dip;
            this.q_type = dataReq.q_type;
            this.ftid = dataReq.ftid;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new DataReq(this, z, null) : (DataReq) invokeZ.objValue;
        }
    }

    /* loaded from: classes10.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-313607503, "Ltbclient/FinePbPage/DataReq;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-313607503, "Ltbclient/FinePbPage/DataReq;");
                return;
            }
        }
        DEFAULT_SCR_W = 0L;
        DEFAULT_SCR_H = 0L;
        DEFAULT_SCR_DIP = 0L;
        DEFAULT_Q_TYPE = 0L;
        DEFAULT_FTID = 0L;
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
            this.f76374common = builder.f76375common;
            Long l = builder.scr_w;
            if (l == null) {
                this.scr_w = DEFAULT_SCR_W;
            } else {
                this.scr_w = l;
            }
            Long l2 = builder.scr_h;
            if (l2 == null) {
                this.scr_h = DEFAULT_SCR_H;
            } else {
                this.scr_h = l2;
            }
            Long l3 = builder.scr_dip;
            if (l3 == null) {
                this.scr_dip = DEFAULT_SCR_DIP;
            } else {
                this.scr_dip = l3;
            }
            Long l4 = builder.q_type;
            if (l4 == null) {
                this.q_type = DEFAULT_Q_TYPE;
            } else {
                this.q_type = l4;
            }
            Long l5 = builder.ftid;
            if (l5 == null) {
                this.ftid = DEFAULT_FTID;
                return;
            } else {
                this.ftid = l5;
                return;
            }
        }
        this.f76374common = builder.f76375common;
        this.scr_w = builder.scr_w;
        this.scr_h = builder.scr_h;
        this.scr_dip = builder.scr_dip;
        this.q_type = builder.q_type;
        this.ftid = builder.ftid;
    }
}
