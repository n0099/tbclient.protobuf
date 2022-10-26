package tbclient;

import com.baidu.android.imsdk.internal.Constants;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InitContext;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.baidu.titan.sdk.runtime.TitanRuntime;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class DealAuthInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_ITEM_CONTENT = "";
    public static final String DEFAULT_ITEM_NAME = "";
    public static final String DEFAULT_ITEM_URL = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String item_content;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String item_name;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String item_url;

    /* loaded from: classes9.dex */
    public /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public final class Builder extends Message.Builder {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String item_content;
        public String item_name;
        public String item_url;

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
        public Builder(DealAuthInfo dealAuthInfo) {
            super(dealAuthInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {dealAuthInfo};
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
            if (dealAuthInfo == null) {
                return;
            }
            this.item_name = dealAuthInfo.item_name;
            this.item_content = dealAuthInfo.item_content;
            this.item_url = dealAuthInfo.item_url;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DealAuthInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new DealAuthInfo(this, z, null);
            }
            return (DealAuthInfo) invokeZ.objValue;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DealAuthInfo(Builder builder, boolean z) {
        super(builder);
        Interceptable interceptable = $ic;
        if (interceptable != null) {
            InitContext newInitContext = TitanRuntime.newInitContext();
            newInitContext.initArgs = r2;
            Object[] objArr = {builder, Boolean.valueOf(z)};
            interceptable.invokeUnInit(65536, newInitContext);
            int i = newInitContext.flag;
            if ((i & 1) != 0) {
                int i2 = i & 2;
                super((Message.Builder) newInitContext.callArgs[0]);
                newInitContext.thisArg = this;
                interceptable.invokeInitBody(65536, newInitContext);
                return;
            }
        }
        if (z) {
            String str = builder.item_name;
            if (str == null) {
                this.item_name = "";
            } else {
                this.item_name = str;
            }
            String str2 = builder.item_content;
            if (str2 == null) {
                this.item_content = "";
            } else {
                this.item_content = str2;
            }
            String str3 = builder.item_url;
            if (str3 == null) {
                this.item_url = "";
                return;
            } else {
                this.item_url = str3;
                return;
            }
        }
        this.item_name = builder.item_name;
        this.item_content = builder.item_content;
        this.item_url = builder.item_url;
    }

    public /* synthetic */ DealAuthInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
