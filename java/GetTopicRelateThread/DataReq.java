package tbclient.GetTopicRelateThread;

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
/* loaded from: classes3.dex */
public final class DataReq extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Long DEFAULT_LAST_ID;
    public static final Integer DEFAULT_PAGE_NO;
    public static final Integer DEFAULT_PMY_SOURCE;
    public static final Long DEFAULT_PMY_TOPIC_ID;
    public static final Integer DEFAULT_Q_TYPE;
    public static final Integer DEFAULT_RN;
    public static final Double DEFAULT_SCR_DIP;
    public static final Integer DEFAULT_SCR_H;
    public static final Integer DEFAULT_SCR_W;
    public static final Integer DEFAULT_SORT_TYPE;
    public static final Long DEFAULT_TOPIC_ID;
    public static final String DEFAULT_TOPIC_NAME = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f72932common;
    @ProtoField(tag = 6, type = Message.Datatype.UINT64)
    public final Long last_id;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer page_no;
    @ProtoField(tag = 12, type = Message.Datatype.UINT32)
    public final Integer pmy_source;
    @ProtoField(tag = 11, type = Message.Datatype.UINT64)
    public final Long pmy_topic_id;
    @ProtoField(tag = 10, type = Message.Datatype.INT32)
    public final Integer q_type;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer rn;
    @ProtoField(tag = 9, type = Message.Datatype.DOUBLE)
    public final Double scr_dip;
    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer scr_h;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer scr_w;
    @ProtoField(tag = 13, type = Message.Datatype.UINT32)
    public final Integer sort_type;
    @ProtoField(tag = 2, type = Message.Datatype.UINT64)
    public final Long topic_id;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String topic_name;

    /* loaded from: classes3.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f72933common;
        public Long last_id;
        public Integer page_no;
        public Integer pmy_source;
        public Long pmy_topic_id;
        public Integer q_type;
        public Integer rn;
        public Double scr_dip;
        public Integer scr_h;
        public Integer scr_w;
        public Integer sort_type;
        public Long topic_id;
        public String topic_name;

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
            this.f72933common = dataReq.f72932common;
            this.topic_id = dataReq.topic_id;
            this.topic_name = dataReq.topic_name;
            this.rn = dataReq.rn;
            this.page_no = dataReq.page_no;
            this.last_id = dataReq.last_id;
            this.scr_w = dataReq.scr_w;
            this.scr_h = dataReq.scr_h;
            this.scr_dip = dataReq.scr_dip;
            this.q_type = dataReq.q_type;
            this.pmy_topic_id = dataReq.pmy_topic_id;
            this.pmy_source = dataReq.pmy_source;
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

    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-1112202896, "Ltbclient/GetTopicRelateThread/DataReq;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-1112202896, "Ltbclient/GetTopicRelateThread/DataReq;");
                return;
            }
        }
        DEFAULT_TOPIC_ID = 0L;
        DEFAULT_RN = 0;
        DEFAULT_PAGE_NO = 0;
        DEFAULT_LAST_ID = 0L;
        DEFAULT_SCR_W = 0;
        DEFAULT_SCR_H = 0;
        DEFAULT_SCR_DIP = Double.valueOf(0.0d);
        DEFAULT_Q_TYPE = 0;
        DEFAULT_PMY_TOPIC_ID = 0L;
        DEFAULT_PMY_SOURCE = 0;
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
            this.f72932common = builder.f72933common;
            Long l = builder.topic_id;
            if (l == null) {
                this.topic_id = DEFAULT_TOPIC_ID;
            } else {
                this.topic_id = l;
            }
            String str = builder.topic_name;
            if (str == null) {
                this.topic_name = "";
            } else {
                this.topic_name = str;
            }
            Integer num = builder.rn;
            if (num == null) {
                this.rn = DEFAULT_RN;
            } else {
                this.rn = num;
            }
            Integer num2 = builder.page_no;
            if (num2 == null) {
                this.page_no = DEFAULT_PAGE_NO;
            } else {
                this.page_no = num2;
            }
            Long l2 = builder.last_id;
            if (l2 == null) {
                this.last_id = DEFAULT_LAST_ID;
            } else {
                this.last_id = l2;
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
            Double d2 = builder.scr_dip;
            if (d2 == null) {
                this.scr_dip = DEFAULT_SCR_DIP;
            } else {
                this.scr_dip = d2;
            }
            Integer num5 = builder.q_type;
            if (num5 == null) {
                this.q_type = DEFAULT_Q_TYPE;
            } else {
                this.q_type = num5;
            }
            Long l3 = builder.pmy_topic_id;
            if (l3 == null) {
                this.pmy_topic_id = DEFAULT_PMY_TOPIC_ID;
            } else {
                this.pmy_topic_id = l3;
            }
            Integer num6 = builder.pmy_source;
            if (num6 == null) {
                this.pmy_source = DEFAULT_PMY_SOURCE;
            } else {
                this.pmy_source = num6;
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
        this.f72932common = builder.f72933common;
        this.topic_id = builder.topic_id;
        this.topic_name = builder.topic_name;
        this.rn = builder.rn;
        this.page_no = builder.page_no;
        this.last_id = builder.last_id;
        this.scr_w = builder.scr_w;
        this.scr_h = builder.scr_h;
        this.scr_dip = builder.scr_dip;
        this.q_type = builder.q_type;
        this.pmy_topic_id = builder.pmy_topic_id;
        this.pmy_source = builder.pmy_source;
        this.sort_type = builder.sort_type;
    }
}
