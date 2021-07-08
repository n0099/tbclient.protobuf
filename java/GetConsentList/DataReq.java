package tbclient.GetConsentList;

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
    public static final Long DEFAULT_AUTHOR_ID;
    public static final Long DEFAULT_GID;
    public static final Long DEFAULT_PAGE_NUM;
    public static final Long DEFAULT_POST_ID;
    public static final Long DEFAULT_RES_NUM;
    public static final Long DEFAULT_THREAD_ID;
    public static final Long DEFAULT_USER_ID;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long author_id;
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f73452common;
    @ProtoField(tag = 4, type = Message.Datatype.INT64)
    public final Long gid;
    @ProtoField(tag = 7, type = Message.Datatype.INT64)
    public final Long page_num;
    @ProtoField(tag = 6, type = Message.Datatype.INT64)
    public final Long post_id;
    @ProtoField(tag = 8, type = Message.Datatype.INT64)
    public final Long res_num;
    @ProtoField(tag = 5, type = Message.Datatype.INT64)
    public final Long thread_id;
    @ProtoField(tag = 3, type = Message.Datatype.INT64)
    public final Long user_id;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Long author_id;

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f73453common;
        public Long gid;
        public Long page_num;
        public Long post_id;
        public Long res_num;
        public Long thread_id;
        public Long user_id;

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
            this.f73453common = dataReq.f73452common;
            this.author_id = dataReq.author_id;
            this.user_id = dataReq.user_id;
            this.gid = dataReq.gid;
            this.thread_id = dataReq.thread_id;
            this.post_id = dataReq.post_id;
            this.page_num = dataReq.page_num;
            this.res_num = dataReq.res_num;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(469296874, "Ltbclient/GetConsentList/DataReq;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(469296874, "Ltbclient/GetConsentList/DataReq;");
                return;
            }
        }
        DEFAULT_AUTHOR_ID = 0L;
        DEFAULT_USER_ID = 0L;
        DEFAULT_GID = 0L;
        DEFAULT_THREAD_ID = 0L;
        DEFAULT_POST_ID = 0L;
        DEFAULT_PAGE_NUM = 0L;
        DEFAULT_RES_NUM = 0L;
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
            this.f73452common = builder.f73453common;
            Long l = builder.author_id;
            if (l == null) {
                this.author_id = DEFAULT_AUTHOR_ID;
            } else {
                this.author_id = l;
            }
            Long l2 = builder.user_id;
            if (l2 == null) {
                this.user_id = DEFAULT_USER_ID;
            } else {
                this.user_id = l2;
            }
            Long l3 = builder.gid;
            if (l3 == null) {
                this.gid = DEFAULT_GID;
            } else {
                this.gid = l3;
            }
            Long l4 = builder.thread_id;
            if (l4 == null) {
                this.thread_id = DEFAULT_THREAD_ID;
            } else {
                this.thread_id = l4;
            }
            Long l5 = builder.post_id;
            if (l5 == null) {
                this.post_id = DEFAULT_POST_ID;
            } else {
                this.post_id = l5;
            }
            Long l6 = builder.page_num;
            if (l6 == null) {
                this.page_num = DEFAULT_PAGE_NUM;
            } else {
                this.page_num = l6;
            }
            Long l7 = builder.res_num;
            if (l7 == null) {
                this.res_num = DEFAULT_RES_NUM;
                return;
            } else {
                this.res_num = l7;
                return;
            }
        }
        this.f73452common = builder.f73453common;
        this.author_id = builder.author_id;
        this.user_id = builder.user_id;
        this.gid = builder.gid;
        this.thread_id = builder.thread_id;
        this.post_id = builder.post_id;
        this.page_num = builder.page_num;
        this.res_num = builder.res_num;
    }
}
