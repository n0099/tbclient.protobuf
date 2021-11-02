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
/* loaded from: classes3.dex */
public final class BawuThrones extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_BAZHU_LEVEL = "";
    public static final Integer DEFAULT_TOTAL_RECOMMEND_NUM;
    public static final Integer DEFAULT_USED_RECOMMEND_NUM;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String bazhu_level;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer total_recommend_num;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer used_recommend_num;

    /* loaded from: classes3.dex */
    public static final class Builder extends Message.Builder<BawuThrones> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String bazhu_level;
        public Integer total_recommend_num;
        public Integer used_recommend_num;

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
        public Builder(BawuThrones bawuThrones) {
            super(bawuThrones);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {bawuThrones};
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
            if (bawuThrones == null) {
                return;
            }
            this.total_recommend_num = bawuThrones.total_recommend_num;
            this.used_recommend_num = bawuThrones.used_recommend_num;
            this.bazhu_level = bawuThrones.bazhu_level;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public BawuThrones build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new BawuThrones(this, z, null) : (BawuThrones) invokeZ.objValue;
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
    }

    public /* synthetic */ BawuThrones(Builder builder, boolean z, a aVar) {
        this(builder, z);
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
                return;
            } else {
                this.bazhu_level = str;
                return;
            }
        }
        this.total_recommend_num = builder.total_recommend_num;
        this.used_recommend_num = builder.used_recommend_num;
        this.bazhu_level = builder.bazhu_level;
    }
}
