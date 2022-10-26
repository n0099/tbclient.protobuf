package tbclient.RelateRecThread;

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
    public static final String DEFAULT_EQID = "";
    public static final Long DEFAULT_FORUM_ID;
    public static final Integer DEFAULT_SOURCE_FROM;
    public static final Integer DEFAULT_SOURCE_TYPE;
    public static final Long DEFAULT_THREAD_ID;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1331common;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String eqid;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long forum_id;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer source_from;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer source_type;
    @ProtoField(tag = 3, type = Message.Datatype.INT64)
    public final Long thread_id;

    /* loaded from: classes9.dex */
    public /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public final class Builder extends Message.Builder {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1332common;
        public String eqid;
        public Long forum_id;
        public Integer source_from;
        public Integer source_type;
        public Long thread_id;

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
            this.f1332common = dataReq.f1331common;
            this.forum_id = dataReq.forum_id;
            this.thread_id = dataReq.thread_id;
            this.source_type = dataReq.source_type;
            this.source_from = dataReq.source_from;
            this.eqid = dataReq.eqid;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new DataReq(this, z, null);
            }
            return (DataReq) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-66958305, "Ltbclient/RelateRecThread/DataReq;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-66958305, "Ltbclient/RelateRecThread/DataReq;");
                return;
            }
        }
        DEFAULT_FORUM_ID = 0L;
        DEFAULT_THREAD_ID = 0L;
        DEFAULT_SOURCE_TYPE = 0;
        DEFAULT_SOURCE_FROM = 0;
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
            this.f1331common = builder.f1332common;
            Long l = builder.forum_id;
            if (l == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = l;
            }
            Long l2 = builder.thread_id;
            if (l2 == null) {
                this.thread_id = DEFAULT_THREAD_ID;
            } else {
                this.thread_id = l2;
            }
            Integer num = builder.source_type;
            if (num == null) {
                this.source_type = DEFAULT_SOURCE_TYPE;
            } else {
                this.source_type = num;
            }
            Integer num2 = builder.source_from;
            if (num2 == null) {
                this.source_from = DEFAULT_SOURCE_FROM;
            } else {
                this.source_from = num2;
            }
            String str = builder.eqid;
            if (str == null) {
                this.eqid = "";
                return;
            } else {
                this.eqid = str;
                return;
            }
        }
        this.f1331common = builder.f1332common;
        this.forum_id = builder.forum_id;
        this.thread_id = builder.thread_id;
        this.source_type = builder.source_type;
        this.source_from = builder.source_from;
        this.eqid = builder.eqid;
    }

    public /* synthetic */ DataReq(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
