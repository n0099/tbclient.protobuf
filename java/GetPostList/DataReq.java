package tbclient.GetPostList;

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
/* loaded from: classes5.dex */
public final class DataReq extends Message {
    public static /* synthetic */ Interceptable $ic;
    public static final Integer DEFAULT_FLOOR_RN;
    public static final Integer DEFAULT_IS_COMM_REVERSE;
    public static final Long DEFAULT_KZ;
    public static final List<Long> DEFAULT_POST_ID;
    public static final Integer DEFAULT_SCR_H;
    public static final Integer DEFAULT_SCR_W;
    public static final Integer DEFAULT_ST_TYPE;
    public static final Integer DEFAULT_WITH_FLOOR;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f65182common;
    @ProtoField(tag = 9, type = Message.Datatype.INT32)
    public final Integer floor_rn;
    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer is_comm_reverse;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long kz;
    @ProtoField(label = Message.Label.REPEATED, tag = 4, type = Message.Datatype.INT64)
    public final List<Long> post_id;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer scr_h;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer scr_w;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer st_type;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer with_floor;

    /* loaded from: classes5.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f65183common;
        public Integer floor_rn;
        public Integer is_comm_reverse;
        public Long kz;
        public List<Long> post_id;
        public Integer scr_h;
        public Integer scr_w;
        public Integer st_type;
        public Integer with_floor;

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
            this.f65183common = dataReq.f65182common;
            this.kz = dataReq.kz;
            this.with_floor = dataReq.with_floor;
            this.post_id = Message.copyOf(dataReq.post_id);
            this.scr_w = dataReq.scr_w;
            this.scr_h = dataReq.scr_h;
            this.st_type = dataReq.st_type;
            this.is_comm_reverse = dataReq.is_comm_reverse;
            this.floor_rn = dataReq.floor_rn;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new DataReq(this, z, null) : (DataReq) invokeZ.objValue;
        }
    }

    /* loaded from: classes5.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(928736012, "Ltbclient/GetPostList/DataReq;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(928736012, "Ltbclient/GetPostList/DataReq;");
                return;
            }
        }
        DEFAULT_KZ = 0L;
        DEFAULT_WITH_FLOOR = 0;
        DEFAULT_POST_ID = Collections.emptyList();
        DEFAULT_SCR_W = 0;
        DEFAULT_SCR_H = 0;
        DEFAULT_ST_TYPE = 0;
        DEFAULT_IS_COMM_REVERSE = 0;
        DEFAULT_FLOOR_RN = 0;
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
            this.f65182common = builder.f65183common;
            Long l = builder.kz;
            if (l == null) {
                this.kz = DEFAULT_KZ;
            } else {
                this.kz = l;
            }
            Integer num = builder.with_floor;
            if (num == null) {
                this.with_floor = DEFAULT_WITH_FLOOR;
            } else {
                this.with_floor = num;
            }
            List<Long> list = builder.post_id;
            if (list == null) {
                this.post_id = DEFAULT_POST_ID;
            } else {
                this.post_id = Message.immutableCopyOf(list);
            }
            Integer num2 = builder.scr_w;
            if (num2 == null) {
                this.scr_w = DEFAULT_SCR_W;
            } else {
                this.scr_w = num2;
            }
            Integer num3 = builder.scr_h;
            if (num3 == null) {
                this.scr_h = DEFAULT_SCR_H;
            } else {
                this.scr_h = num3;
            }
            Integer num4 = builder.st_type;
            if (num4 == null) {
                this.st_type = DEFAULT_ST_TYPE;
            } else {
                this.st_type = num4;
            }
            Integer num5 = builder.is_comm_reverse;
            if (num5 == null) {
                this.is_comm_reverse = DEFAULT_IS_COMM_REVERSE;
            } else {
                this.is_comm_reverse = num5;
            }
            Integer num6 = builder.floor_rn;
            if (num6 == null) {
                this.floor_rn = DEFAULT_FLOOR_RN;
                return;
            } else {
                this.floor_rn = num6;
                return;
            }
        }
        this.f65182common = builder.f65183common;
        this.kz = builder.kz;
        this.with_floor = builder.with_floor;
        this.post_id = Message.immutableCopyOf(builder.post_id);
        this.scr_w = builder.scr_w;
        this.scr_h = builder.scr_h;
        this.st_type = builder.st_type;
        this.is_comm_reverse = builder.is_comm_reverse;
        this.floor_rn = builder.floor_rn;
    }
}
