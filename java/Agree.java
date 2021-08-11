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
/* loaded from: classes2.dex */
public final class Agree extends Message {
    public static /* synthetic */ Interceptable $ic;
    public static final Long DEFAULT_AGREE_NUM;
    public static final Integer DEFAULT_AGREE_TYPE;
    public static final Long DEFAULT_DIFF_AGREE_NUM;
    public static final Long DEFAULT_DISAGREE_NUM;
    public static final Integer DEFAULT_HAS_AGREE;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long agree_num;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer agree_type;
    @ProtoField(tag = 5, type = Message.Datatype.INT64)
    public final Long diff_agree_num;
    @ProtoField(tag = 4, type = Message.Datatype.INT64)
    public final Long disagree_num;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer has_agree;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<Agree> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Long agree_num;
        public Integer agree_type;
        public Long diff_agree_num;
        public Long disagree_num;
        public Integer has_agree;

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
        public Builder(Agree agree) {
            super(agree);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {agree};
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
            if (agree == null) {
                return;
            }
            this.agree_num = agree.agree_num;
            this.has_agree = agree.has_agree;
            this.agree_type = agree.agree_type;
            this.disagree_num = agree.disagree_num;
            this.diff_agree_num = agree.diff_agree_num;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Agree build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new Agree(this, z, null) : (Agree) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(109454457, "Ltbclient/Agree;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(109454457, "Ltbclient/Agree;");
                return;
            }
        }
        DEFAULT_AGREE_NUM = 0L;
        DEFAULT_HAS_AGREE = 0;
        DEFAULT_AGREE_TYPE = 0;
        DEFAULT_DISAGREE_NUM = 0L;
        DEFAULT_DIFF_AGREE_NUM = 0L;
    }

    public /* synthetic */ Agree(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Agree(Builder builder, boolean z) {
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
            Long l = builder.agree_num;
            if (l == null) {
                this.agree_num = DEFAULT_AGREE_NUM;
            } else {
                this.agree_num = l;
            }
            Integer num = builder.has_agree;
            if (num == null) {
                this.has_agree = DEFAULT_HAS_AGREE;
            } else {
                this.has_agree = num;
            }
            Integer num2 = builder.agree_type;
            if (num2 == null) {
                this.agree_type = DEFAULT_AGREE_TYPE;
            } else {
                this.agree_type = num2;
            }
            Long l2 = builder.disagree_num;
            if (l2 == null) {
                this.disagree_num = DEFAULT_DISAGREE_NUM;
            } else {
                this.disagree_num = l2;
            }
            Long l3 = builder.diff_agree_num;
            if (l3 == null) {
                this.diff_agree_num = DEFAULT_DIFF_AGREE_NUM;
                return;
            } else {
                this.diff_agree_num = l3;
                return;
            }
        }
        this.agree_num = builder.agree_num;
        this.has_agree = builder.has_agree;
        this.agree_type = builder.agree_type;
        this.disagree_num = builder.disagree_num;
        this.diff_agree_num = builder.diff_agree_num;
    }
}
