package tbclient.VideoTopicList;

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
    public static final Long DEFAULT_PN;
    public static final String DEFAULT_Q_TYPE = "";
    public static final Integer DEFAULT_RN;
    public static final String DEFAULT_SCR_DIP = "";
    public static final Integer DEFAULT_SCR_H;
    public static final Integer DEFAULT_SCR_W;
    public static final Integer DEFAULT_TOPIC_ID;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f74023common;
    @ProtoField(tag = 8, type = Message.Datatype.INT64)
    public final Long pn;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String q_type;
    @ProtoField(tag = 6, type = Message.Datatype.UINT32)
    public final Integer rn;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String scr_dip;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer scr_h;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer scr_w;
    @ProtoField(tag = 7, type = Message.Datatype.UINT32)
    public final Integer topic_id;

    /* loaded from: classes3.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f74024common;
        public Long pn;
        public String q_type;
        public Integer rn;
        public String scr_dip;
        public Integer scr_h;
        public Integer scr_w;
        public Integer topic_id;

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
            this.f74024common = dataReq.f74023common;
            this.scr_w = dataReq.scr_w;
            this.scr_h = dataReq.scr_h;
            this.q_type = dataReq.q_type;
            this.scr_dip = dataReq.scr_dip;
            this.rn = dataReq.rn;
            this.topic_id = dataReq.topic_id;
            this.pn = dataReq.pn;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(1068470106, "Ltbclient/VideoTopicList/DataReq;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(1068470106, "Ltbclient/VideoTopicList/DataReq;");
                return;
            }
        }
        DEFAULT_SCR_W = 0;
        DEFAULT_SCR_H = 0;
        DEFAULT_RN = 0;
        DEFAULT_TOPIC_ID = 0;
        DEFAULT_PN = 0L;
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
            this.f74023common = builder.f74024common;
            Integer num = builder.scr_w;
            if (num == null) {
                this.scr_w = DEFAULT_SCR_W;
            } else {
                this.scr_w = num;
            }
            Integer num2 = builder.scr_h;
            if (num2 == null) {
                this.scr_h = DEFAULT_SCR_H;
            } else {
                this.scr_h = num2;
            }
            String str = builder.q_type;
            if (str == null) {
                this.q_type = "";
            } else {
                this.q_type = str;
            }
            String str2 = builder.scr_dip;
            if (str2 == null) {
                this.scr_dip = "";
            } else {
                this.scr_dip = str2;
            }
            Integer num3 = builder.rn;
            if (num3 == null) {
                this.rn = DEFAULT_RN;
            } else {
                this.rn = num3;
            }
            Integer num4 = builder.topic_id;
            if (num4 == null) {
                this.topic_id = DEFAULT_TOPIC_ID;
            } else {
                this.topic_id = num4;
            }
            Long l = builder.pn;
            if (l == null) {
                this.pn = DEFAULT_PN;
                return;
            } else {
                this.pn = l;
                return;
            }
        }
        this.f74023common = builder.f74024common;
        this.scr_w = builder.scr_w;
        this.scr_h = builder.scr_h;
        this.q_type = builder.q_type;
        this.scr_dip = builder.scr_dip;
        this.rn = builder.rn;
        this.topic_id = builder.topic_id;
        this.pn = builder.pn;
    }
}
