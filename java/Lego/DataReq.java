package tbclient.Lego;

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
    public static final String DEFAULT_FLIP_ID = "";
    public static final String DEFAULT_ITEM_ID = "";
    public static final Long DEFAULT_PAGE_ID;
    public static final Integer DEFAULT_PAGE_TYPE;
    public static final String DEFAULT_PARAMS = "";
    public static final Integer DEFAULT_PN;
    public static final Integer DEFAULT_RN;
    public static final Double DEFAULT_SCR_DIP;
    public static final Integer DEFAULT_SCR_H;
    public static final Integer DEFAULT_SCR_W;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1288common;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String flip_id;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String item_id;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long page_id;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer page_type;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String params;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer pn;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer rn;
    @ProtoField(tag = 11, type = Message.Datatype.DOUBLE)
    public final Double scr_dip;
    @ProtoField(tag = 10, type = Message.Datatype.INT32)
    public final Integer scr_h;
    @ProtoField(tag = 9, type = Message.Datatype.INT32)
    public final Integer scr_w;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1289common;
        public String flip_id;
        public String item_id;
        public Long page_id;
        public Integer page_type;
        public String params;
        public Integer pn;
        public Integer rn;
        public Double scr_dip;
        public Integer scr_h;
        public Integer scr_w;

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
        public Builder(DataReq dataReq) {
            super(dataReq);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {dataReq};
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
            if (dataReq == null) {
                return;
            }
            this.f1289common = dataReq.f1288common;
            this.page_id = dataReq.page_id;
            this.page_type = dataReq.page_type;
            this.pn = dataReq.pn;
            this.rn = dataReq.rn;
            this.flip_id = dataReq.flip_id;
            this.item_id = dataReq.item_id;
            this.params = dataReq.params;
            this.scr_w = dataReq.scr_w;
            this.scr_h = dataReq.scr_h;
            this.scr_dip = dataReq.scr_dip;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(115853259, "Ltbclient/Lego/DataReq;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(115853259, "Ltbclient/Lego/DataReq;");
                return;
            }
        }
        DEFAULT_PAGE_ID = 0L;
        DEFAULT_PAGE_TYPE = 0;
        DEFAULT_PN = 0;
        DEFAULT_RN = 0;
        DEFAULT_SCR_W = 0;
        DEFAULT_SCR_H = 0;
        DEFAULT_SCR_DIP = Double.valueOf(0.0d);
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
            this.f1288common = builder.f1289common;
            Long l = builder.page_id;
            if (l == null) {
                this.page_id = DEFAULT_PAGE_ID;
            } else {
                this.page_id = l;
            }
            Integer num = builder.page_type;
            if (num == null) {
                this.page_type = DEFAULT_PAGE_TYPE;
            } else {
                this.page_type = num;
            }
            Integer num2 = builder.pn;
            if (num2 == null) {
                this.pn = DEFAULT_PN;
            } else {
                this.pn = num2;
            }
            Integer num3 = builder.rn;
            if (num3 == null) {
                this.rn = DEFAULT_RN;
            } else {
                this.rn = num3;
            }
            String str = builder.flip_id;
            if (str == null) {
                this.flip_id = "";
            } else {
                this.flip_id = str;
            }
            String str2 = builder.item_id;
            if (str2 == null) {
                this.item_id = "";
            } else {
                this.item_id = str2;
            }
            String str3 = builder.params;
            if (str3 == null) {
                this.params = "";
            } else {
                this.params = str3;
            }
            Integer num4 = builder.scr_w;
            if (num4 == null) {
                this.scr_w = DEFAULT_SCR_W;
            } else {
                this.scr_w = num4;
            }
            Integer num5 = builder.scr_h;
            if (num5 == null) {
                this.scr_h = DEFAULT_SCR_H;
            } else {
                this.scr_h = num5;
            }
            Double d = builder.scr_dip;
            if (d == null) {
                this.scr_dip = DEFAULT_SCR_DIP;
                return;
            } else {
                this.scr_dip = d;
                return;
            }
        }
        this.f1288common = builder.f1289common;
        this.page_id = builder.page_id;
        this.page_type = builder.page_type;
        this.pn = builder.pn;
        this.rn = builder.rn;
        this.flip_id = builder.flip_id;
        this.item_id = builder.item_id;
        this.params = builder.params;
        this.scr_w = builder.scr_w;
        this.scr_h = builder.scr_h;
        this.scr_dip = builder.scr_dip;
    }
}
