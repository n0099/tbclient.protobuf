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
import java.util.Collections;
import java.util.List;
/* loaded from: classes9.dex */
public final class LiveFuseForumData extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_BJIMG_DARK_BIG = "";
    public static final String DEFAULT_BJIMG_DARK_SMALL = "";
    public static final String DEFAULT_BJIMG_LIGHT_BIG = "";
    public static final String DEFAULT_BJIMG_LIGHT_SMALL = "";
    public static final List<String> DEFAULT_HEAD_IMG;
    public static final Integer DEFAULT_HEAD_IMG_STYLE;
    public static final String DEFAULT_ICON_URL = "";
    public static final String DEFAULT_ONLINE_USERS = "";
    public static final String DEFAULT_SCHEMA = "";
    public static final List<String> DEFAULT_TITLE;
    public static final Integer DEFAULT_TYPE;
    public static final String DEFAULT_YYEXT = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String bjimg_dark_big;
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String bjimg_dark_small;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String bjimg_light_big;
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String bjimg_light_small;
    @ProtoField(label = Message.Label.REPEATED, tag = 2, type = Message.Datatype.STRING)
    public final List<String> head_img;
    @ProtoField(tag = 13, type = Message.Datatype.INT32)
    public final Integer head_img_style;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String icon_url;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String online_users;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String schema;
    @ProtoField(label = Message.Label.REPEATED, tag = 3, type = Message.Datatype.STRING)
    public final List<String> title;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer type;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String yyext;

    /* loaded from: classes9.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<LiveFuseForumData> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String bjimg_dark_big;
        public String bjimg_dark_small;
        public String bjimg_light_big;
        public String bjimg_light_small;
        public List<String> head_img;
        public Integer head_img_style;
        public String icon_url;
        public String online_users;
        public String schema;
        public List<String> title;
        public Integer type;
        public String yyext;

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
        public Builder(LiveFuseForumData liveFuseForumData) {
            super(liveFuseForumData);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {liveFuseForumData};
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
            if (liveFuseForumData == null) {
                return;
            }
            this.online_users = liveFuseForumData.online_users;
            this.head_img = Message.copyOf(liveFuseForumData.head_img);
            this.title = Message.copyOf(liveFuseForumData.title);
            this.schema = liveFuseForumData.schema;
            this.type = liveFuseForumData.type;
            this.yyext = liveFuseForumData.yyext;
            this.icon_url = liveFuseForumData.icon_url;
            this.bjimg_dark_big = liveFuseForumData.bjimg_dark_big;
            this.bjimg_light_big = liveFuseForumData.bjimg_light_big;
            this.bjimg_dark_small = liveFuseForumData.bjimg_dark_small;
            this.bjimg_light_small = liveFuseForumData.bjimg_light_small;
            this.head_img_style = liveFuseForumData.head_img_style;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public LiveFuseForumData build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new LiveFuseForumData(this, z, null);
            }
            return (LiveFuseForumData) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-378363296, "Ltbclient/FrsPage/LiveFuseForumData;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-378363296, "Ltbclient/FrsPage/LiveFuseForumData;");
                return;
            }
        }
        DEFAULT_HEAD_IMG = Collections.emptyList();
        DEFAULT_TITLE = Collections.emptyList();
        DEFAULT_TYPE = 0;
        DEFAULT_HEAD_IMG_STYLE = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveFuseForumData(Builder builder, boolean z) {
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
            String str = builder.online_users;
            if (str == null) {
                this.online_users = "";
            } else {
                this.online_users = str;
            }
            List<String> list = builder.head_img;
            if (list == null) {
                this.head_img = DEFAULT_HEAD_IMG;
            } else {
                this.head_img = Message.immutableCopyOf(list);
            }
            List<String> list2 = builder.title;
            if (list2 == null) {
                this.title = DEFAULT_TITLE;
            } else {
                this.title = Message.immutableCopyOf(list2);
            }
            String str2 = builder.schema;
            if (str2 == null) {
                this.schema = "";
            } else {
                this.schema = str2;
            }
            Integer num = builder.type;
            if (num == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = num;
            }
            String str3 = builder.yyext;
            if (str3 == null) {
                this.yyext = "";
            } else {
                this.yyext = str3;
            }
            String str4 = builder.icon_url;
            if (str4 == null) {
                this.icon_url = "";
            } else {
                this.icon_url = str4;
            }
            String str5 = builder.bjimg_dark_big;
            if (str5 == null) {
                this.bjimg_dark_big = "";
            } else {
                this.bjimg_dark_big = str5;
            }
            String str6 = builder.bjimg_light_big;
            if (str6 == null) {
                this.bjimg_light_big = "";
            } else {
                this.bjimg_light_big = str6;
            }
            String str7 = builder.bjimg_dark_small;
            if (str7 == null) {
                this.bjimg_dark_small = "";
            } else {
                this.bjimg_dark_small = str7;
            }
            String str8 = builder.bjimg_light_small;
            if (str8 == null) {
                this.bjimg_light_small = "";
            } else {
                this.bjimg_light_small = str8;
            }
            Integer num2 = builder.head_img_style;
            if (num2 == null) {
                this.head_img_style = DEFAULT_HEAD_IMG_STYLE;
                return;
            } else {
                this.head_img_style = num2;
                return;
            }
        }
        this.online_users = builder.online_users;
        this.head_img = Message.immutableCopyOf(builder.head_img);
        this.title = Message.immutableCopyOf(builder.title);
        this.schema = builder.schema;
        this.type = builder.type;
        this.yyext = builder.yyext;
        this.icon_url = builder.icon_url;
        this.bjimg_dark_big = builder.bjimg_dark_big;
        this.bjimg_light_big = builder.bjimg_light_big;
        this.bjimg_dark_small = builder.bjimg_dark_small;
        this.bjimg_light_small = builder.bjimg_light_small;
        this.head_img_style = builder.head_img_style;
    }

    public /* synthetic */ LiveFuseForumData(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
