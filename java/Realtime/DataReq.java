package tbclient.Realtime;

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
    public static final String DEFAULT_ABTEST_TAG = "";
    public static final Integer DEFAULT_LOCATION;
    public static final String DEFAULT_ORI_UGC_NID = "";
    public static final String DEFAULT_ORI_UGC_TID = "";
    public static final String DEFAULT_ORI_UGC_TYPE = "";
    public static final String DEFAULT_ORI_UGC_VID = "";
    public static final String DEFAULT_PAGE = "";
    public static final String DEFAULT_SOURCE = "";
    public static final Long DEFAULT_TID;
    public static final Integer DEFAULT_TYPE;
    public static final String DEFAULT_WEIGHT = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String abtest_tag;
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f73021common;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer location;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String ori_ugc_nid;
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String ori_ugc_tid;
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String ori_ugc_type;
    @ProtoField(tag = 12, type = Message.Datatype.STRING)
    public final String ori_ugc_vid;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String page;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String source;
    @ProtoField(tag = 2, type = Message.Datatype.UINT64)
    public final Long tid;
    @ProtoField(tag = 7, type = Message.Datatype.UINT32)
    public final Integer type;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String weight;

    /* loaded from: classes3.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String abtest_tag;

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f73022common;
        public Integer location;
        public String ori_ugc_nid;
        public String ori_ugc_tid;
        public String ori_ugc_type;
        public String ori_ugc_vid;
        public String page;
        public String source;
        public Long tid;
        public Integer type;
        public String weight;

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
            this.f73022common = dataReq.f73021common;
            this.tid = dataReq.tid;
            this.weight = dataReq.weight;
            this.source = dataReq.source;
            this.location = dataReq.location;
            this.abtest_tag = dataReq.abtest_tag;
            this.type = dataReq.type;
            this.page = dataReq.page;
            this.ori_ugc_nid = dataReq.ori_ugc_nid;
            this.ori_ugc_tid = dataReq.ori_ugc_tid;
            this.ori_ugc_type = dataReq.ori_ugc_type;
            this.ori_ugc_vid = dataReq.ori_ugc_vid;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-23825727, "Ltbclient/Realtime/DataReq;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-23825727, "Ltbclient/Realtime/DataReq;");
                return;
            }
        }
        DEFAULT_TID = 0L;
        DEFAULT_LOCATION = 0;
        DEFAULT_TYPE = 0;
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
            this.f73021common = builder.f73022common;
            Long l = builder.tid;
            if (l == null) {
                this.tid = DEFAULT_TID;
            } else {
                this.tid = l;
            }
            String str = builder.weight;
            if (str == null) {
                this.weight = "";
            } else {
                this.weight = str;
            }
            String str2 = builder.source;
            if (str2 == null) {
                this.source = "";
            } else {
                this.source = str2;
            }
            Integer num = builder.location;
            if (num == null) {
                this.location = DEFAULT_LOCATION;
            } else {
                this.location = num;
            }
            String str3 = builder.abtest_tag;
            if (str3 == null) {
                this.abtest_tag = "";
            } else {
                this.abtest_tag = str3;
            }
            Integer num2 = builder.type;
            if (num2 == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = num2;
            }
            String str4 = builder.page;
            if (str4 == null) {
                this.page = "";
            } else {
                this.page = str4;
            }
            String str5 = builder.ori_ugc_nid;
            if (str5 == null) {
                this.ori_ugc_nid = "";
            } else {
                this.ori_ugc_nid = str5;
            }
            String str6 = builder.ori_ugc_tid;
            if (str6 == null) {
                this.ori_ugc_tid = "";
            } else {
                this.ori_ugc_tid = str6;
            }
            String str7 = builder.ori_ugc_type;
            if (str7 == null) {
                this.ori_ugc_type = "";
            } else {
                this.ori_ugc_type = str7;
            }
            String str8 = builder.ori_ugc_vid;
            if (str8 == null) {
                this.ori_ugc_vid = "";
                return;
            } else {
                this.ori_ugc_vid = str8;
                return;
            }
        }
        this.f73021common = builder.f73022common;
        this.tid = builder.tid;
        this.weight = builder.weight;
        this.source = builder.source;
        this.location = builder.location;
        this.abtest_tag = builder.abtest_tag;
        this.type = builder.type;
        this.page = builder.page;
        this.ori_ugc_nid = builder.ori_ugc_nid;
        this.ori_ugc_tid = builder.ori_ugc_tid;
        this.ori_ugc_type = builder.ori_ugc_type;
        this.ori_ugc_vid = builder.ori_ugc_vid;
    }
}
