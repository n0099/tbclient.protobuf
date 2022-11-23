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
public final class PkCoreInfo extends Message {
    public static /* synthetic */ Interceptable $ic;
    public static final Long DEFAULT_ANCHOR_PK_SCORE;
    public static final Long DEFAULT_LEFT_TIME;
    public static final Long DEFAULT_PK_ID;
    public static final Integer DEFAULT_PK_RET;
    public static final Integer DEFAULT_PK_RET_TYPE;
    public static final Integer DEFAULT_PK_STATUS;
    public static final Long DEFAULT_RIVAL_PK_SCORE;
    public static final Long DEFAULT_START_TIME;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 7, type = Message.Datatype.INT64)
    public final Long anchor_pk_score;
    @ProtoField(tag = 6, type = Message.Datatype.INT64)
    public final Long left_time;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long pk_id;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer pk_ret;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer pk_ret_type;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer pk_status;
    @ProtoField(tag = 8, type = Message.Datatype.INT64)
    public final Long rival_pk_score;
    @ProtoField(tag = 5, type = Message.Datatype.UINT64)
    public final Long start_time;

    /* loaded from: classes9.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<PkCoreInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Long anchor_pk_score;
        public Long left_time;
        public Long pk_id;
        public Integer pk_ret;
        public Integer pk_ret_type;
        public Integer pk_status;
        public Long rival_pk_score;
        public Long start_time;

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
        public Builder(PkCoreInfo pkCoreInfo) {
            super(pkCoreInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {pkCoreInfo};
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
            if (pkCoreInfo == null) {
                return;
            }
            this.pk_id = pkCoreInfo.pk_id;
            this.pk_status = pkCoreInfo.pk_status;
            this.pk_ret = pkCoreInfo.pk_ret;
            this.pk_ret_type = pkCoreInfo.pk_ret_type;
            this.start_time = pkCoreInfo.start_time;
            this.left_time = pkCoreInfo.left_time;
            this.anchor_pk_score = pkCoreInfo.anchor_pk_score;
            this.rival_pk_score = pkCoreInfo.rival_pk_score;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PkCoreInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new PkCoreInfo(this, z, null);
            }
            return (PkCoreInfo) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-1232655863, "Ltbclient/PkCoreInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-1232655863, "Ltbclient/PkCoreInfo;");
                return;
            }
        }
        DEFAULT_PK_ID = 0L;
        DEFAULT_PK_STATUS = 0;
        DEFAULT_PK_RET = 0;
        DEFAULT_PK_RET_TYPE = 0;
        DEFAULT_START_TIME = 0L;
        DEFAULT_LEFT_TIME = 0L;
        DEFAULT_ANCHOR_PK_SCORE = 0L;
        DEFAULT_RIVAL_PK_SCORE = 0L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PkCoreInfo(Builder builder, boolean z) {
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
            Long l = builder.pk_id;
            if (l == null) {
                this.pk_id = DEFAULT_PK_ID;
            } else {
                this.pk_id = l;
            }
            Integer num = builder.pk_status;
            if (num == null) {
                this.pk_status = DEFAULT_PK_STATUS;
            } else {
                this.pk_status = num;
            }
            Integer num2 = builder.pk_ret;
            if (num2 == null) {
                this.pk_ret = DEFAULT_PK_RET;
            } else {
                this.pk_ret = num2;
            }
            Integer num3 = builder.pk_ret_type;
            if (num3 == null) {
                this.pk_ret_type = DEFAULT_PK_RET_TYPE;
            } else {
                this.pk_ret_type = num3;
            }
            Long l2 = builder.start_time;
            if (l2 == null) {
                this.start_time = DEFAULT_START_TIME;
            } else {
                this.start_time = l2;
            }
            Long l3 = builder.left_time;
            if (l3 == null) {
                this.left_time = DEFAULT_LEFT_TIME;
            } else {
                this.left_time = l3;
            }
            Long l4 = builder.anchor_pk_score;
            if (l4 == null) {
                this.anchor_pk_score = DEFAULT_ANCHOR_PK_SCORE;
            } else {
                this.anchor_pk_score = l4;
            }
            Long l5 = builder.rival_pk_score;
            if (l5 == null) {
                this.rival_pk_score = DEFAULT_RIVAL_PK_SCORE;
                return;
            } else {
                this.rival_pk_score = l5;
                return;
            }
        }
        this.pk_id = builder.pk_id;
        this.pk_status = builder.pk_status;
        this.pk_ret = builder.pk_ret;
        this.pk_ret_type = builder.pk_ret_type;
        this.start_time = builder.start_time;
        this.left_time = builder.left_time;
        this.anchor_pk_score = builder.anchor_pk_score;
        this.rival_pk_score = builder.rival_pk_score;
    }

    public /* synthetic */ PkCoreInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
