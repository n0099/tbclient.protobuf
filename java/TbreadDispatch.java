package tbclient;

import com.baidu.android.imsdk.internal.Constants;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InitContext;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.baidu.titan.sdk.runtime.TitanRuntime;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes5.dex */
public final class TbreadDispatch extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_FLOOR_NUM = "";
    public static final String DEFAULT_PRODUCT_ID = "";
    public static final String DEFAULT_PRODUCT_TYPE = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String floor_num;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String product_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String product_type;

    /* loaded from: classes5.dex */
    public static final class Builder extends Message.Builder<TbreadDispatch> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String floor_num;
        public String product_id;
        public String product_type;

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
        public Builder(TbreadDispatch tbreadDispatch) {
            super(tbreadDispatch);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {tbreadDispatch};
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
            if (tbreadDispatch == null) {
                return;
            }
            this.floor_num = tbreadDispatch.floor_num;
            this.product_type = tbreadDispatch.product_type;
            this.product_id = tbreadDispatch.product_id;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public TbreadDispatch build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new TbreadDispatch(this, z, null) : (TbreadDispatch) invokeZ.objValue;
        }
    }

    /* loaded from: classes5.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    public /* synthetic */ TbreadDispatch(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TbreadDispatch(Builder builder, boolean z) {
        super(builder);
        Interceptable interceptable = $ic;
        if (interceptable != null) {
            InitContext newInitContext = TitanRuntime.newInitContext();
            newInitContext.initArgs = r2;
            Object[] objArr = {builder, Boolean.valueOf(z)};
            interceptable.invokeUnInit(65536, newInitContext);
            int i2 = newInitContext.flag;
            if ((i2 & 1) != 0) {
                int i3 = i2 & 2;
                super((Message.Builder) newInitContext.callArgs[0]);
                newInitContext.thisArg = this;
                interceptable.invokeInitBody(65536, newInitContext);
                return;
            }
        }
        if (z) {
            String str = builder.floor_num;
            if (str == null) {
                this.floor_num = "";
            } else {
                this.floor_num = str;
            }
            String str2 = builder.product_type;
            if (str2 == null) {
                this.product_type = "";
            } else {
                this.product_type = str2;
            }
            String str3 = builder.product_id;
            if (str3 == null) {
                this.product_id = "";
                return;
            } else {
                this.product_id = str3;
                return;
            }
        }
        this.floor_num = builder.floor_num;
        this.product_type = builder.product_type;
        this.product_id = builder.product_id;
    }
}
