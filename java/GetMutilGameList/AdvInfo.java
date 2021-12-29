package tbclient.GetMutilGameList;

import com.baidu.android.imsdk.internal.Constants;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InitContext;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.baidu.titan.sdk.runtime.TitanRuntime;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes5.dex */
public final class AdvInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_AD_LINK_ANDROID = "";
    public static final String DEFAULT_AD_LINK_IOS = "";
    public static final String DEFAULT_AD_LINK_WEBVIEW = "";
    public static final String DEFAULT_AD_PIC = "";
    public static final String DEFAULT_GAME_ID = "";
    public static final String DEFAULT_GAME_NAME = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String ad_link_android;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String ad_link_ios;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String ad_link_webview;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String ad_pic;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String game_id;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String game_name;

    /* loaded from: classes5.dex */
    public static final class Builder extends Message.Builder<AdvInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String ad_link_android;
        public String ad_link_ios;
        public String ad_link_webview;
        public String ad_pic;
        public String game_id;
        public String game_name;

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
        public Builder(AdvInfo advInfo) {
            super(advInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {advInfo};
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
            if (advInfo == null) {
                return;
            }
            this.game_name = advInfo.game_name;
            this.game_id = advInfo.game_id;
            this.ad_link_android = advInfo.ad_link_android;
            this.ad_link_webview = advInfo.ad_link_webview;
            this.ad_link_ios = advInfo.ad_link_ios;
            this.ad_pic = advInfo.ad_pic;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AdvInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new AdvInfo(this, z, null) : (AdvInfo) invokeZ.objValue;
        }
    }

    /* loaded from: classes5.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    public /* synthetic */ AdvInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvInfo(Builder builder, boolean z) {
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
            String str = builder.game_name;
            if (str == null) {
                this.game_name = "";
            } else {
                this.game_name = str;
            }
            String str2 = builder.game_id;
            if (str2 == null) {
                this.game_id = "";
            } else {
                this.game_id = str2;
            }
            String str3 = builder.ad_link_android;
            if (str3 == null) {
                this.ad_link_android = "";
            } else {
                this.ad_link_android = str3;
            }
            String str4 = builder.ad_link_webview;
            if (str4 == null) {
                this.ad_link_webview = "";
            } else {
                this.ad_link_webview = str4;
            }
            String str5 = builder.ad_link_ios;
            if (str5 == null) {
                this.ad_link_ios = "";
            } else {
                this.ad_link_ios = str5;
            }
            String str6 = builder.ad_pic;
            if (str6 == null) {
                this.ad_pic = "";
                return;
            } else {
                this.ad_pic = str6;
                return;
            }
        }
        this.game_name = builder.game_name;
        this.game_id = builder.game_id;
        this.ad_link_android = builder.ad_link_android;
        this.ad_link_webview = builder.ad_link_webview;
        this.ad_link_ios = builder.ad_link_ios;
        this.ad_pic = builder.ad_pic;
    }
}
