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
public final class TwAnchorProfitItem extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Integer DEFAULT_AVAILABLE_ANCHOR_LEVEL;
    public static final String DEFAULT_ICON_LOCK_URL = "";
    public static final String DEFAULT_ICON_UNLOCK_URL = "";
    public static final Integer DEFAULT_ID;
    public static final String DEFAULT_NAME = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer available_anchor_level;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String icon_lock_url;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String icon_unlock_url;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer id;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String name;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<TwAnchorProfitItem> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer available_anchor_level;
        public String icon_lock_url;
        public String icon_unlock_url;
        public Integer id;
        public String name;

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
        public Builder(TwAnchorProfitItem twAnchorProfitItem) {
            super(twAnchorProfitItem);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {twAnchorProfitItem};
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
            if (twAnchorProfitItem == null) {
                return;
            }
            this.id = twAnchorProfitItem.id;
            this.available_anchor_level = twAnchorProfitItem.available_anchor_level;
            this.name = twAnchorProfitItem.name;
            this.icon_unlock_url = twAnchorProfitItem.icon_unlock_url;
            this.icon_lock_url = twAnchorProfitItem.icon_lock_url;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public TwAnchorProfitItem build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new TwAnchorProfitItem(this, z, null) : (TwAnchorProfitItem) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-1842997182, "Ltbclient/TwAnchorProfitItem;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-1842997182, "Ltbclient/TwAnchorProfitItem;");
                return;
            }
        }
        DEFAULT_ID = 0;
        DEFAULT_AVAILABLE_ANCHOR_LEVEL = 0;
    }

    public /* synthetic */ TwAnchorProfitItem(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TwAnchorProfitItem(Builder builder, boolean z) {
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
            Integer num = builder.id;
            if (num == null) {
                this.id = DEFAULT_ID;
            } else {
                this.id = num;
            }
            Integer num2 = builder.available_anchor_level;
            if (num2 == null) {
                this.available_anchor_level = DEFAULT_AVAILABLE_ANCHOR_LEVEL;
            } else {
                this.available_anchor_level = num2;
            }
            String str = builder.name;
            if (str == null) {
                this.name = "";
            } else {
                this.name = str;
            }
            String str2 = builder.icon_unlock_url;
            if (str2 == null) {
                this.icon_unlock_url = "";
            } else {
                this.icon_unlock_url = str2;
            }
            String str3 = builder.icon_lock_url;
            if (str3 == null) {
                this.icon_lock_url = "";
                return;
            } else {
                this.icon_lock_url = str3;
                return;
            }
        }
        this.id = builder.id;
        this.available_anchor_level = builder.available_anchor_level;
        this.name = builder.name;
        this.icon_unlock_url = builder.icon_unlock_url;
        this.icon_lock_url = builder.icon_lock_url;
    }
}
