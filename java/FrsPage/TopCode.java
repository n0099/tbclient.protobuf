package tbclient.FrsPage;

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
public final class TopCode extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_CODE_LINK = "";
    public static final String DEFAULT_GAME_LINK = "";
    public static final Integer DEFAULT_GET_TYPE;
    public static final Long DEFAULT_GIFTWORTH;
    public static final String DEFAULT_IMG_URL = "";
    public static final String DEFAULT_SUBTITLE = "";
    public static final String DEFAULT_SUMMARY = "";
    public static final String DEFAULT_SURPLUSGIFT = "";
    public static final String DEFAULT_TYPE_TEXT = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String code_link;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String game_link;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer get_type;
    @ProtoField(tag = 7, type = Message.Datatype.INT64)
    public final Long giftworth;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String img_url;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String subtitle;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String summary;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String surplusgift;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String type_text;

    /* loaded from: classes5.dex */
    public static final class Builder extends Message.Builder<TopCode> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String code_link;
        public String game_link;
        public Integer get_type;
        public Long giftworth;
        public String img_url;
        public String subtitle;
        public String summary;
        public String surplusgift;
        public String type_text;

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
        public Builder(TopCode topCode) {
            super(topCode);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {topCode};
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
            if (topCode == null) {
                return;
            }
            this.img_url = topCode.img_url;
            this.game_link = topCode.game_link;
            this.summary = topCode.summary;
            this.code_link = topCode.code_link;
            this.get_type = topCode.get_type;
            this.surplusgift = topCode.surplusgift;
            this.giftworth = topCode.giftworth;
            this.type_text = topCode.type_text;
            this.subtitle = topCode.subtitle;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public TopCode build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new TopCode(this, z, null) : (TopCode) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(275922492, "Ltbclient/FrsPage/TopCode;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(275922492, "Ltbclient/FrsPage/TopCode;");
                return;
            }
        }
        DEFAULT_GET_TYPE = 0;
        DEFAULT_GIFTWORTH = 0L;
    }

    public /* synthetic */ TopCode(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopCode(Builder builder, boolean z) {
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
            String str = builder.img_url;
            if (str == null) {
                this.img_url = "";
            } else {
                this.img_url = str;
            }
            String str2 = builder.game_link;
            if (str2 == null) {
                this.game_link = "";
            } else {
                this.game_link = str2;
            }
            String str3 = builder.summary;
            if (str3 == null) {
                this.summary = "";
            } else {
                this.summary = str3;
            }
            String str4 = builder.code_link;
            if (str4 == null) {
                this.code_link = "";
            } else {
                this.code_link = str4;
            }
            Integer num = builder.get_type;
            if (num == null) {
                this.get_type = DEFAULT_GET_TYPE;
            } else {
                this.get_type = num;
            }
            String str5 = builder.surplusgift;
            if (str5 == null) {
                this.surplusgift = "";
            } else {
                this.surplusgift = str5;
            }
            Long l = builder.giftworth;
            if (l == null) {
                this.giftworth = DEFAULT_GIFTWORTH;
            } else {
                this.giftworth = l;
            }
            String str6 = builder.type_text;
            if (str6 == null) {
                this.type_text = "";
            } else {
                this.type_text = str6;
            }
            String str7 = builder.subtitle;
            if (str7 == null) {
                this.subtitle = "";
                return;
            } else {
                this.subtitle = str7;
                return;
            }
        }
        this.img_url = builder.img_url;
        this.game_link = builder.game_link;
        this.summary = builder.summary;
        this.code_link = builder.code_link;
        this.get_type = builder.get_type;
        this.surplusgift = builder.surplusgift;
        this.giftworth = builder.giftworth;
        this.type_text = builder.type_text;
        this.subtitle = builder.subtitle;
    }
}
