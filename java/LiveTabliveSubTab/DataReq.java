package tbclient.LiveTabliveSubTab;

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
    public static /* synthetic */ Interceptable $ic = null;
    public static final Integer DEFAULT_ENTRY_ID;
    public static final String DEFAULT_ENTRY_NAME = "";
    public static final String DEFAULT_LABEL_NAME = "";
    public static final Integer DEFAULT_PN;
    public static final Integer DEFAULT_PS;
    public static final Integer DEFAULT_Q_TYPE;
    public static final Double DEFAULT_SCR_DIP;
    public static final Integer DEFAULT_SCR_H;
    public static final Integer DEFAULT_SCR_W;
    public static final Integer DEFAULT_SORT_TYPE;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f74044common;
    @ProtoField(tag = 9, type = Message.Datatype.INT32)
    public final Integer entry_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String entry_name;
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String label_name;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer pn;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer ps;
    @ProtoField(tag = 7, type = Message.Datatype.UINT32)
    public final Integer q_type;
    @ProtoField(tag = 8, type = Message.Datatype.DOUBLE)
    public final Double scr_dip;
    @ProtoField(tag = 6, type = Message.Datatype.UINT32)
    public final Integer scr_h;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer scr_w;
    @ProtoField(tag = 11, type = Message.Datatype.INT32)
    public final Integer sort_type;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f74045common;
        public Integer entry_id;
        public String entry_name;
        public String label_name;
        public Integer pn;
        public Integer ps;
        public Integer q_type;
        public Double scr_dip;
        public Integer scr_h;
        public Integer scr_w;
        public Integer sort_type;

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
            this.f74045common = dataReq.f74044common;
            this.entry_name = dataReq.entry_name;
            this.pn = dataReq.pn;
            this.ps = dataReq.ps;
            this.scr_w = dataReq.scr_w;
            this.scr_h = dataReq.scr_h;
            this.q_type = dataReq.q_type;
            this.scr_dip = dataReq.scr_dip;
            this.entry_id = dataReq.entry_id;
            this.label_name = dataReq.label_name;
            this.sort_type = dataReq.sort_type;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-30306794, "Ltbclient/LiveTabliveSubTab/DataReq;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-30306794, "Ltbclient/LiveTabliveSubTab/DataReq;");
                return;
            }
        }
        DEFAULT_PN = 0;
        DEFAULT_PS = 0;
        DEFAULT_SCR_W = 0;
        DEFAULT_SCR_H = 0;
        DEFAULT_Q_TYPE = 0;
        DEFAULT_SCR_DIP = Double.valueOf(0.0d);
        DEFAULT_ENTRY_ID = 0;
        DEFAULT_SORT_TYPE = 0;
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
            this.f74044common = builder.f74045common;
            String str = builder.entry_name;
            if (str == null) {
                this.entry_name = "";
            } else {
                this.entry_name = str;
            }
            Integer num = builder.pn;
            if (num == null) {
                this.pn = DEFAULT_PN;
            } else {
                this.pn = num;
            }
            Integer num2 = builder.ps;
            if (num2 == null) {
                this.ps = DEFAULT_PS;
            } else {
                this.ps = num2;
            }
            Integer num3 = builder.scr_w;
            if (num3 == null) {
                this.scr_w = DEFAULT_SCR_W;
            } else {
                this.scr_w = num3;
            }
            Integer num4 = builder.scr_h;
            if (num4 == null) {
                this.scr_h = DEFAULT_SCR_H;
            } else {
                this.scr_h = num4;
            }
            Integer num5 = builder.q_type;
            if (num5 == null) {
                this.q_type = DEFAULT_Q_TYPE;
            } else {
                this.q_type = num5;
            }
            Double d2 = builder.scr_dip;
            if (d2 == null) {
                this.scr_dip = DEFAULT_SCR_DIP;
            } else {
                this.scr_dip = d2;
            }
            Integer num6 = builder.entry_id;
            if (num6 == null) {
                this.entry_id = DEFAULT_ENTRY_ID;
            } else {
                this.entry_id = num6;
            }
            String str2 = builder.label_name;
            if (str2 == null) {
                this.label_name = "";
            } else {
                this.label_name = str2;
            }
            Integer num7 = builder.sort_type;
            if (num7 == null) {
                this.sort_type = DEFAULT_SORT_TYPE;
                return;
            } else {
                this.sort_type = num7;
                return;
            }
        }
        this.f74044common = builder.f74045common;
        this.entry_name = builder.entry_name;
        this.pn = builder.pn;
        this.ps = builder.ps;
        this.scr_w = builder.scr_w;
        this.scr_h = builder.scr_h;
        this.q_type = builder.q_type;
        this.scr_dip = builder.scr_dip;
        this.entry_id = builder.entry_id;
        this.label_name = builder.label_name;
        this.sort_type = builder.sort_type;
    }
}
