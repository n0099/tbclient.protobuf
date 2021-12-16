package tbclient.PbPage;

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
/* loaded from: classes5.dex */
public final class GodCard extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_BUTTON_TEXT = "";
    public static final String DEFAULT_BUTTON_URL = "";
    public static final String DEFAULT_PIC_URL = "";
    public static final String DEFAULT_PORTRAIT = "";
    public static final Integer DEFAULT_SHOW_FLOOR;
    public static final String DEFAULT_TEXT = "";
    public static final String DEFAULT_TIME_EX = "";
    public static final String DEFAULT_USER_NAME = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String button_text;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String button_url;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String pic_url;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String portrait;
    @ProtoField(tag = 8, type = Message.Datatype.UINT32)
    public final Integer show_floor;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String text;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String time_ex;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String user_name;

    /* loaded from: classes5.dex */
    public static final class Builder extends Message.Builder<GodCard> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String button_text;
        public String button_url;
        public String pic_url;
        public String portrait;
        public Integer show_floor;
        public String text;
        public String time_ex;
        public String user_name;

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
        public Builder(GodCard godCard) {
            super(godCard);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {godCard};
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
            if (godCard == null) {
                return;
            }
            this.user_name = godCard.user_name;
            this.portrait = godCard.portrait;
            this.time_ex = godCard.time_ex;
            this.text = godCard.text;
            this.pic_url = godCard.pic_url;
            this.button_text = godCard.button_text;
            this.button_url = godCard.button_url;
            this.show_floor = godCard.show_floor;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GodCard build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new GodCard(this, z, null) : (GodCard) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-1386104653, "Ltbclient/PbPage/GodCard;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-1386104653, "Ltbclient/PbPage/GodCard;");
                return;
            }
        }
        DEFAULT_SHOW_FLOOR = 0;
    }

    public /* synthetic */ GodCard(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GodCard(Builder builder, boolean z) {
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
            String str = builder.user_name;
            if (str == null) {
                this.user_name = "";
            } else {
                this.user_name = str;
            }
            String str2 = builder.portrait;
            if (str2 == null) {
                this.portrait = "";
            } else {
                this.portrait = str2;
            }
            String str3 = builder.time_ex;
            if (str3 == null) {
                this.time_ex = "";
            } else {
                this.time_ex = str3;
            }
            String str4 = builder.text;
            if (str4 == null) {
                this.text = "";
            } else {
                this.text = str4;
            }
            String str5 = builder.pic_url;
            if (str5 == null) {
                this.pic_url = "";
            } else {
                this.pic_url = str5;
            }
            String str6 = builder.button_text;
            if (str6 == null) {
                this.button_text = "";
            } else {
                this.button_text = str6;
            }
            String str7 = builder.button_url;
            if (str7 == null) {
                this.button_url = "";
            } else {
                this.button_url = str7;
            }
            Integer num = builder.show_floor;
            if (num == null) {
                this.show_floor = DEFAULT_SHOW_FLOOR;
                return;
            } else {
                this.show_floor = num;
                return;
            }
        }
        this.user_name = builder.user_name;
        this.portrait = builder.portrait;
        this.time_ex = builder.time_ex;
        this.text = builder.text;
        this.pic_url = builder.pic_url;
        this.button_text = builder.button_text;
        this.button_url = builder.button_url;
        this.show_floor = builder.show_floor;
    }
}
