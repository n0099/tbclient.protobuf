package tbclient.Userlike;

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
/* loaded from: classes2.dex */
public final class DataReq extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_AD_EXT_PARAMS = "";
    public static final Integer DEFAULT_FOLLOW_TYPE;
    public static final Long DEFAULT_LAST_REQ_UNIX;
    public static final Integer DEFAULT_LOAD_TYPE;
    public static final String DEFAULT_PAGE_TAG = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String ad_ext_params;
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f80231common;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer follow_type;
    @ProtoField(tag = 3, type = Message.Datatype.UINT64)
    public final Long last_req_unix;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer load_type;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String page_tag;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String ad_ext_params;

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f80232common;
        public Integer follow_type;
        public Long last_req_unix;
        public Integer load_type;
        public String page_tag;

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
            this.f80232common = dataReq.f80231common;
            this.page_tag = dataReq.page_tag;
            this.last_req_unix = dataReq.last_req_unix;
            this.follow_type = dataReq.follow_type;
            this.load_type = dataReq.load_type;
            this.ad_ext_params = dataReq.ad_ext_params;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new DataReq(this, z, null) : (DataReq) invokeZ.objValue;
        }
    }

    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(1531639850, "Ltbclient/Userlike/DataReq;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(1531639850, "Ltbclient/Userlike/DataReq;");
                return;
            }
        }
        DEFAULT_LAST_REQ_UNIX = 0L;
        DEFAULT_FOLLOW_TYPE = 0;
        DEFAULT_LOAD_TYPE = 0;
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
            this.f80231common = builder.f80232common;
            String str = builder.page_tag;
            if (str == null) {
                this.page_tag = "";
            } else {
                this.page_tag = str;
            }
            Long l = builder.last_req_unix;
            if (l == null) {
                this.last_req_unix = DEFAULT_LAST_REQ_UNIX;
            } else {
                this.last_req_unix = l;
            }
            Integer num = builder.follow_type;
            if (num == null) {
                this.follow_type = DEFAULT_FOLLOW_TYPE;
            } else {
                this.follow_type = num;
            }
            Integer num2 = builder.load_type;
            if (num2 == null) {
                this.load_type = DEFAULT_LOAD_TYPE;
            } else {
                this.load_type = num2;
            }
            String str2 = builder.ad_ext_params;
            if (str2 == null) {
                this.ad_ext_params = "";
                return;
            } else {
                this.ad_ext_params = str2;
                return;
            }
        }
        this.f80231common = builder.f80232common;
        this.page_tag = builder.page_tag;
        this.last_req_unix = builder.last_req_unix;
        this.follow_type = builder.follow_type;
        this.load_type = builder.load_type;
        this.ad_ext_params = builder.ad_ext_params;
    }
}
