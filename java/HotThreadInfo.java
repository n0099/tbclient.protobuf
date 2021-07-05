package tbclient;

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
/* loaded from: classes10.dex */
public final class HotThreadInfo extends Message {
    public static /* synthetic */ Interceptable $ic;
    public static final Integer DEFAULT_CID;
    public static final Integer DEFAULT_HMTYPE;
    public static final Integer DEFAULT_HOT_WEIGHT;
    public static final Long DEFAULT_POST_NUM;
    public static final Long DEFAULT_THREAD_ID;
    public static final Integer DEFAULT_TIME_TYPE;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer cid;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer hmtype;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer hot_weight;
    @ProtoField(tag = 2, type = Message.Datatype.UINT64)
    public final Long post_num;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long thread_id;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer time_type;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<HotThreadInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer cid;
        public Integer hmtype;
        public Integer hot_weight;
        public Long post_num;
        public Long thread_id;
        public Integer time_type;

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
        public Builder(HotThreadInfo hotThreadInfo) {
            super(hotThreadInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {hotThreadInfo};
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
            if (hotThreadInfo == null) {
                return;
            }
            this.thread_id = hotThreadInfo.thread_id;
            this.post_num = hotThreadInfo.post_num;
            this.cid = hotThreadInfo.cid;
            this.hmtype = hotThreadInfo.hmtype;
            this.time_type = hotThreadInfo.time_type;
            this.hot_weight = hotThreadInfo.hot_weight;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public HotThreadInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new HotThreadInfo(this, z, null) : (HotThreadInfo) invokeZ.objValue;
        }
    }

    /* loaded from: classes10.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(257356352, "Ltbclient/HotThreadInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(257356352, "Ltbclient/HotThreadInfo;");
                return;
            }
        }
        DEFAULT_THREAD_ID = 0L;
        DEFAULT_POST_NUM = 0L;
        DEFAULT_CID = 0;
        DEFAULT_HMTYPE = 0;
        DEFAULT_TIME_TYPE = 0;
        DEFAULT_HOT_WEIGHT = 0;
    }

    public /* synthetic */ HotThreadInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotThreadInfo(Builder builder, boolean z) {
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
            Long l = builder.thread_id;
            if (l == null) {
                this.thread_id = DEFAULT_THREAD_ID;
            } else {
                this.thread_id = l;
            }
            Long l2 = builder.post_num;
            if (l2 == null) {
                this.post_num = DEFAULT_POST_NUM;
            } else {
                this.post_num = l2;
            }
            Integer num = builder.cid;
            if (num == null) {
                this.cid = DEFAULT_CID;
            } else {
                this.cid = num;
            }
            Integer num2 = builder.hmtype;
            if (num2 == null) {
                this.hmtype = DEFAULT_HMTYPE;
            } else {
                this.hmtype = num2;
            }
            Integer num3 = builder.time_type;
            if (num3 == null) {
                this.time_type = DEFAULT_TIME_TYPE;
            } else {
                this.time_type = num3;
            }
            Integer num4 = builder.hot_weight;
            if (num4 == null) {
                this.hot_weight = DEFAULT_HOT_WEIGHT;
                return;
            } else {
                this.hot_weight = num4;
                return;
            }
        }
        this.thread_id = builder.thread_id;
        this.post_num = builder.post_num;
        this.cid = builder.cid;
        this.hmtype = builder.hmtype;
        this.time_type = builder.time_type;
        this.hot_weight = builder.hot_weight;
    }
}
