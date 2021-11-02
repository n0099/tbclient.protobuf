package tbclient.GetForumBroadcastList;

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
import java.util.Collections;
import java.util.List;
import tbclient.CommonReq;
/* loaded from: classes3.dex */
public final class DataReq extends Message {
    public static /* synthetic */ Interceptable $ic;
    public static final List<Long> DEFAULT_BCAST_IDS;
    public static final Long DEFAULT_FORUM_ID;
    public static final Integer DEFAULT_NEED_CNT;
    public static final Integer DEFAULT_QUERY_TYPE;
    public static final Integer DEFAULT_STAFF_ID;
    public static final Long DEFAULT_STAFF_ID64;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(label = Message.Label.REPEATED, tag = 6, type = Message.Datatype.INT64)
    public final List<Long> bcast_ids;
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f72843common;
    @ProtoField(tag = 5, type = Message.Datatype.INT64)
    public final Long forum_id;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer need_cnt;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer query_type;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer staff_id;
    @ProtoField(tag = 7, type = Message.Datatype.INT64)
    public final Long staff_id64;

    /* loaded from: classes3.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public List<Long> bcast_ids;

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f72844common;
        public Long forum_id;
        public Integer need_cnt;
        public Integer query_type;
        public Integer staff_id;
        public Long staff_id64;

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
            this.f72844common = dataReq.f72843common;
            this.query_type = dataReq.query_type;
            this.staff_id = dataReq.staff_id;
            this.need_cnt = dataReq.need_cnt;
            this.forum_id = dataReq.forum_id;
            this.bcast_ids = Message.copyOf(dataReq.bcast_ids);
            this.staff_id64 = dataReq.staff_id64;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(2068175372, "Ltbclient/GetForumBroadcastList/DataReq;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(2068175372, "Ltbclient/GetForumBroadcastList/DataReq;");
                return;
            }
        }
        DEFAULT_QUERY_TYPE = 0;
        DEFAULT_STAFF_ID = 0;
        DEFAULT_NEED_CNT = 0;
        DEFAULT_FORUM_ID = 0L;
        DEFAULT_BCAST_IDS = Collections.emptyList();
        DEFAULT_STAFF_ID64 = 0L;
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
            this.f72843common = builder.f72844common;
            Integer num = builder.query_type;
            if (num == null) {
                this.query_type = DEFAULT_QUERY_TYPE;
            } else {
                this.query_type = num;
            }
            Integer num2 = builder.staff_id;
            if (num2 == null) {
                this.staff_id = DEFAULT_STAFF_ID;
            } else {
                this.staff_id = num2;
            }
            Integer num3 = builder.need_cnt;
            if (num3 == null) {
                this.need_cnt = DEFAULT_NEED_CNT;
            } else {
                this.need_cnt = num3;
            }
            Long l = builder.forum_id;
            if (l == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = l;
            }
            List<Long> list = builder.bcast_ids;
            if (list == null) {
                this.bcast_ids = DEFAULT_BCAST_IDS;
            } else {
                this.bcast_ids = Message.immutableCopyOf(list);
            }
            Long l2 = builder.staff_id64;
            if (l2 == null) {
                this.staff_id64 = DEFAULT_STAFF_ID64;
                return;
            } else {
                this.staff_id64 = l2;
                return;
            }
        }
        this.f72843common = builder.f72844common;
        this.query_type = builder.query_type;
        this.staff_id = builder.staff_id;
        this.need_cnt = builder.need_cnt;
        this.forum_id = builder.forum_id;
        this.bcast_ids = Message.immutableCopyOf(builder.bcast_ids);
        this.staff_id64 = builder.staff_id64;
    }
}
