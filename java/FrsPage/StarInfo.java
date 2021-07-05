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
/* loaded from: classes10.dex */
public final class StarInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final List<Focus> DEFAULT_FOCUS;
    public static final Integer DEFAULT_GENDER;
    public static final Integer DEFAULT_HAS_FRS_STAR;
    public static final String DEFAULT_HEAD = "";
    public static final String DEFAULT_STAR_FORUM_HEADIMG = "";
    public static final String DEFAULT_TOP = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 6)
    public final Fans fans;
    @ProtoField(label = Message.Label.REPEATED, tag = 7)
    public final List<Focus> focus;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer gender;
    @ProtoField(tag = 12)
    public final Good good;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer has_frs_star;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String head;
    @ProtoField(tag = 15)
    public final Size head_size;
    @ProtoField(tag = 13)
    public final Identify identify;
    @ProtoField(tag = 5)
    public final Info info;
    @ProtoField(tag = 10)
    public final Music music;
    @ProtoField(tag = 11)
    public final Music mv;
    @ProtoField(tag = 8)
    public final PhotoInfo photo;
    @ProtoField(tag = 17, type = Message.Datatype.STRING)
    public final String star_forum_headimg;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String top;
    @ProtoField(tag = 14)
    public final Size top_size;
    @ProtoField(tag = 16)
    public final Ticket trade;
    @ProtoField(tag = 9)
    public final Video video;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<StarInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Fans fans;
        public List<Focus> focus;
        public Integer gender;
        public Good good;
        public Integer has_frs_star;
        public String head;
        public Size head_size;
        public Identify identify;
        public Info info;
        public Music music;
        public Music mv;
        public PhotoInfo photo;
        public String star_forum_headimg;
        public String top;
        public Size top_size;
        public Ticket trade;
        public Video video;

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
        public Builder(StarInfo starInfo) {
            super(starInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {starInfo};
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
            if (starInfo == null) {
                return;
            }
            this.has_frs_star = starInfo.has_frs_star;
            this.top = starInfo.top;
            this.head = starInfo.head;
            this.gender = starInfo.gender;
            this.info = starInfo.info;
            this.fans = starInfo.fans;
            this.focus = Message.copyOf(starInfo.focus);
            this.photo = starInfo.photo;
            this.video = starInfo.video;
            this.music = starInfo.music;
            this.mv = starInfo.mv;
            this.good = starInfo.good;
            this.identify = starInfo.identify;
            this.top_size = starInfo.top_size;
            this.head_size = starInfo.head_size;
            this.trade = starInfo.trade;
            this.star_forum_headimg = starInfo.star_forum_headimg;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public StarInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new StarInfo(this, z, null) : (StarInfo) invokeZ.objValue;
        }
    }

    /* loaded from: classes10.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-1516609576, "Ltbclient/FrsPage/StarInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-1516609576, "Ltbclient/FrsPage/StarInfo;");
                return;
            }
        }
        DEFAULT_HAS_FRS_STAR = 0;
        DEFAULT_GENDER = 0;
        DEFAULT_FOCUS = Collections.emptyList();
    }

    public /* synthetic */ StarInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StarInfo(Builder builder, boolean z) {
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
            Integer num = builder.has_frs_star;
            if (num == null) {
                this.has_frs_star = DEFAULT_HAS_FRS_STAR;
            } else {
                this.has_frs_star = num;
            }
            String str = builder.top;
            if (str == null) {
                this.top = "";
            } else {
                this.top = str;
            }
            String str2 = builder.head;
            if (str2 == null) {
                this.head = "";
            } else {
                this.head = str2;
            }
            Integer num2 = builder.gender;
            if (num2 == null) {
                this.gender = DEFAULT_GENDER;
            } else {
                this.gender = num2;
            }
            this.info = builder.info;
            this.fans = builder.fans;
            List<Focus> list = builder.focus;
            if (list == null) {
                this.focus = DEFAULT_FOCUS;
            } else {
                this.focus = Message.immutableCopyOf(list);
            }
            this.photo = builder.photo;
            this.video = builder.video;
            this.music = builder.music;
            this.mv = builder.mv;
            this.good = builder.good;
            this.identify = builder.identify;
            this.top_size = builder.top_size;
            this.head_size = builder.head_size;
            this.trade = builder.trade;
            String str3 = builder.star_forum_headimg;
            if (str3 == null) {
                this.star_forum_headimg = "";
                return;
            } else {
                this.star_forum_headimg = str3;
                return;
            }
        }
        this.has_frs_star = builder.has_frs_star;
        this.top = builder.top;
        this.head = builder.head;
        this.gender = builder.gender;
        this.info = builder.info;
        this.fans = builder.fans;
        this.focus = Message.immutableCopyOf(builder.focus);
        this.photo = builder.photo;
        this.video = builder.video;
        this.music = builder.music;
        this.mv = builder.mv;
        this.good = builder.good;
        this.identify = builder.identify;
        this.top_size = builder.top_size;
        this.head_size = builder.head_size;
        this.trade = builder.trade;
        this.star_forum_headimg = builder.star_forum_headimg;
    }
}
