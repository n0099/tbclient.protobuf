package tbclient.GameForumGuideTab;

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
/* loaded from: classes8.dex */
public final class DataReq extends Message {
    public static /* synthetic */ Interceptable $ic;
    public static final Long DEFAULT_FORUM_ID;
    public static final Integer DEFAULT_NEED_TAB_STUCT;
    public static final Integer DEFAULT_PN;
    public static final Integer DEFAULT_PS;
    public static final Integer DEFAULT_SUB_LABEL_ID;
    public static final Integer DEFAULT_SUB_TAB_ID;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f45558common;
    @ProtoField(tag = 4, type = Message.Datatype.INT64)
    public final Long forum_id;
    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer need_tab_stuct;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer pn;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer ps;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer sub_label_id;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer sub_tab_id;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f45559common;
        public Long forum_id;
        public Integer need_tab_stuct;
        public Integer pn;
        public Integer ps;
        public Integer sub_label_id;
        public Integer sub_tab_id;

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
            this.f45559common = dataReq.f45558common;
            this.pn = dataReq.pn;
            this.ps = dataReq.ps;
            this.forum_id = dataReq.forum_id;
            this.sub_tab_id = dataReq.sub_tab_id;
            this.sub_label_id = dataReq.sub_label_id;
            this.need_tab_stuct = dataReq.need_tab_stuct;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new DataReq(this, z, null) : (DataReq) invokeZ.objValue;
        }
    }

    /* loaded from: classes8.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-496368520, "Ltbclient/GameForumGuideTab/DataReq;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-496368520, "Ltbclient/GameForumGuideTab/DataReq;");
                return;
            }
        }
        DEFAULT_PN = 0;
        DEFAULT_PS = 0;
        DEFAULT_FORUM_ID = 0L;
        DEFAULT_SUB_TAB_ID = 0;
        DEFAULT_SUB_LABEL_ID = 0;
        DEFAULT_NEED_TAB_STUCT = 0;
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
            this.f45558common = builder.f45559common;
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
            Long l = builder.forum_id;
            if (l == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = l;
            }
            Integer num3 = builder.sub_tab_id;
            if (num3 == null) {
                this.sub_tab_id = DEFAULT_SUB_TAB_ID;
            } else {
                this.sub_tab_id = num3;
            }
            Integer num4 = builder.sub_label_id;
            if (num4 == null) {
                this.sub_label_id = DEFAULT_SUB_LABEL_ID;
            } else {
                this.sub_label_id = num4;
            }
            Integer num5 = builder.need_tab_stuct;
            if (num5 == null) {
                this.need_tab_stuct = DEFAULT_NEED_TAB_STUCT;
                return;
            } else {
                this.need_tab_stuct = num5;
                return;
            }
        }
        this.f45558common = builder.f45559common;
        this.pn = builder.pn;
        this.ps = builder.ps;
        this.forum_id = builder.forum_id;
        this.sub_tab_id = builder.sub_tab_id;
        this.sub_label_id = builder.sub_label_id;
        this.need_tab_stuct = builder.need_tab_stuct;
    }
}
