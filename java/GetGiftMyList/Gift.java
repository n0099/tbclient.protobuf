package tbclient.GetGiftMyList;

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
public final class Gift extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Integer DEFAULT_GIFT_ID;
    public static final String DEFAULT_NAME = "";
    public static final Integer DEFAULT_NUM;
    public static final String DEFAULT_PLAY_URL = "";
    public static final Integer DEFAULT_SEND_TIME;
    public static final String DEFAULT_THUMBNAIL_URL = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer gift_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String name;
    @ProtoField(tag = 6, type = Message.Datatype.UINT32)
    public final Integer num;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String play_url;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer send_time;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String thumbnail_url;

    /* loaded from: classes3.dex */
    public static final class Builder extends Message.Builder<Gift> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer gift_id;
        public String name;
        public Integer num;
        public String play_url;
        public Integer send_time;
        public String thumbnail_url;

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
        public Builder(Gift gift) {
            super(gift);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {gift};
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
            if (gift == null) {
                return;
            }
            this.gift_id = gift.gift_id;
            this.name = gift.name;
            this.play_url = gift.play_url;
            this.thumbnail_url = gift.thumbnail_url;
            this.send_time = gift.send_time;
            this.num = gift.num;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Gift build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new Gift(this, z, null) : (Gift) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(414863010, "Ltbclient/GetGiftMyList/Gift;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(414863010, "Ltbclient/GetGiftMyList/Gift;");
                return;
            }
        }
        DEFAULT_GIFT_ID = 0;
        DEFAULT_SEND_TIME = 0;
        DEFAULT_NUM = 0;
    }

    public /* synthetic */ Gift(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gift(Builder builder, boolean z) {
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
            Integer num = builder.gift_id;
            if (num == null) {
                this.gift_id = DEFAULT_GIFT_ID;
            } else {
                this.gift_id = num;
            }
            String str = builder.name;
            if (str == null) {
                this.name = "";
            } else {
                this.name = str;
            }
            String str2 = builder.play_url;
            if (str2 == null) {
                this.play_url = "";
            } else {
                this.play_url = str2;
            }
            String str3 = builder.thumbnail_url;
            if (str3 == null) {
                this.thumbnail_url = "";
            } else {
                this.thumbnail_url = str3;
            }
            Integer num2 = builder.send_time;
            if (num2 == null) {
                this.send_time = DEFAULT_SEND_TIME;
            } else {
                this.send_time = num2;
            }
            Integer num3 = builder.num;
            if (num3 == null) {
                this.num = DEFAULT_NUM;
                return;
            } else {
                this.num = num3;
                return;
            }
        }
        this.gift_id = builder.gift_id;
        this.name = builder.name;
        this.play_url = builder.play_url;
        this.thumbnail_url = builder.thumbnail_url;
        this.send_time = builder.send_time;
        this.num = builder.num;
    }
}
