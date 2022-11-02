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
/* loaded from: classes9.dex */
public final class BawuThrones extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_BAZHU_LEVEL = "";
    public static final Integer DEFAULT_HAS_SEND_BCAST;
    public static final Integer DEFAULT_NEWEST_BCAST_PUSHUSER_CNT;
    public static final Integer DEFAULT_NEWEST_BCAST_PV;
    public static final Integer DEFAULT_TOTAL_BCAST_CNT;
    public static final Integer DEFAULT_TOTAL_RECOMMEND_NUM;
    public static final Integer DEFAULT_USED_BCAST_CNT;
    public static final Integer DEFAULT_USED_RECOMMEND_NUM;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String bazhu_level;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer has_send_bcast;
    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer newest_bcast_pushuser_cnt;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer newest_bcast_pv;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer total_bcast_cnt;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer total_recommend_num;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer used_bcast_cnt;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer used_recommend_num;

    /* loaded from: classes9.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<BawuThrones> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String bazhu_level;
        public Integer has_send_bcast;
        public Integer newest_bcast_pushuser_cnt;
        public Integer newest_bcast_pv;
        public Integer total_bcast_cnt;
        public Integer total_recommend_num;
        public Integer used_bcast_cnt;
        public Integer used_recommend_num;

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
        public Builder(BawuThrones bawuThrones) {
            super(bawuThrones);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {bawuThrones};
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
            if (bawuThrones == null) {
                return;
            }
            this.total_recommend_num = bawuThrones.total_recommend_num;
            this.used_recommend_num = bawuThrones.used_recommend_num;
            this.bazhu_level = bawuThrones.bazhu_level;
            this.used_bcast_cnt = bawuThrones.used_bcast_cnt;
            this.total_bcast_cnt = bawuThrones.total_bcast_cnt;
            this.newest_bcast_pv = bawuThrones.newest_bcast_pv;
            this.has_send_bcast = bawuThrones.has_send_bcast;
            this.newest_bcast_pushuser_cnt = bawuThrones.newest_bcast_pushuser_cnt;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public BawuThrones build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new BawuThrones(this, z, null);
            }
            return (BawuThrones) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-1365941833, "Ltbclient/BawuThrones;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-1365941833, "Ltbclient/BawuThrones;");
                return;
            }
        }
        DEFAULT_TOTAL_RECOMMEND_NUM = 0;
        DEFAULT_USED_RECOMMEND_NUM = 0;
        DEFAULT_USED_BCAST_CNT = 0;
        DEFAULT_TOTAL_BCAST_CNT = 0;
        DEFAULT_NEWEST_BCAST_PV = 0;
        DEFAULT_HAS_SEND_BCAST = 0;
        DEFAULT_NEWEST_BCAST_PUSHUSER_CNT = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BawuThrones(Builder builder, boolean z) {
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
            Integer num = builder.total_recommend_num;
            if (num == null) {
                this.total_recommend_num = DEFAULT_TOTAL_RECOMMEND_NUM;
            } else {
                this.total_recommend_num = num;
            }
            Integer num2 = builder.used_recommend_num;
            if (num2 == null) {
                this.used_recommend_num = DEFAULT_USED_RECOMMEND_NUM;
            } else {
                this.used_recommend_num = num2;
            }
            String str = builder.bazhu_level;
            if (str == null) {
                this.bazhu_level = "";
            } else {
                this.bazhu_level = str;
            }
            Integer num3 = builder.used_bcast_cnt;
            if (num3 == null) {
                this.used_bcast_cnt = DEFAULT_USED_BCAST_CNT;
            } else {
                this.used_bcast_cnt = num3;
            }
            Integer num4 = builder.total_bcast_cnt;
            if (num4 == null) {
                this.total_bcast_cnt = DEFAULT_TOTAL_BCAST_CNT;
            } else {
                this.total_bcast_cnt = num4;
            }
            Integer num5 = builder.newest_bcast_pv;
            if (num5 == null) {
                this.newest_bcast_pv = DEFAULT_NEWEST_BCAST_PV;
            } else {
                this.newest_bcast_pv = num5;
            }
            Integer num6 = builder.has_send_bcast;
            if (num6 == null) {
                this.has_send_bcast = DEFAULT_HAS_SEND_BCAST;
            } else {
                this.has_send_bcast = num6;
            }
            Integer num7 = builder.newest_bcast_pushuser_cnt;
            if (num7 == null) {
                this.newest_bcast_pushuser_cnt = DEFAULT_NEWEST_BCAST_PUSHUSER_CNT;
                return;
            } else {
                this.newest_bcast_pushuser_cnt = num7;
                return;
            }
        }
        this.total_recommend_num = builder.total_recommend_num;
        this.used_recommend_num = builder.used_recommend_num;
        this.bazhu_level = builder.bazhu_level;
        this.used_bcast_cnt = builder.used_bcast_cnt;
        this.total_bcast_cnt = builder.total_bcast_cnt;
        this.newest_bcast_pv = builder.newest_bcast_pv;
        this.has_send_bcast = builder.has_send_bcast;
        this.newest_bcast_pushuser_cnt = builder.newest_bcast_pushuser_cnt;
    }

    public /* synthetic */ BawuThrones(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
