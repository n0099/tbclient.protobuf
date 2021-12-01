package tbclient.HomePage;

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
/* loaded from: classes4.dex */
public final class HotVideoItem extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_ABSTRACT = "";
    public static final String DEFAULT_THUMBNAIL_URL = "";
    public static final Long DEFAULT_TID;
    public static final String DEFAULT_TITLE = "";
    public static final String DEFAULT_VIDEO_DURATION = "";
    public static final String DEFAULT_VIDEO_MD5 = "";
    public static final String DEFAULT_VIDEO_URL = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String _abstract;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String thumbnail_url;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long tid;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String video_duration;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String video_md5;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String video_url;

    /* loaded from: classes4.dex */
    public static final class Builder extends Message.Builder<HotVideoItem> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String _abstract;
        public String thumbnail_url;
        public Long tid;
        public String title;
        public String video_duration;
        public String video_md5;
        public String video_url;

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
        public Builder(HotVideoItem hotVideoItem) {
            super(hotVideoItem);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {hotVideoItem};
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
            if (hotVideoItem == null) {
                return;
            }
            this.tid = hotVideoItem.tid;
            this.title = hotVideoItem.title;
            this._abstract = hotVideoItem._abstract;
            this.thumbnail_url = hotVideoItem.thumbnail_url;
            this.video_url = hotVideoItem.video_url;
            this.video_duration = hotVideoItem.video_duration;
            this.video_md5 = hotVideoItem.video_md5;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public HotVideoItem build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new HotVideoItem(this, z, null) : (HotVideoItem) invokeZ.objValue;
        }
    }

    /* loaded from: classes4.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(1211506947, "Ltbclient/HomePage/HotVideoItem;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(1211506947, "Ltbclient/HomePage/HotVideoItem;");
                return;
            }
        }
        DEFAULT_TID = 0L;
    }

    public /* synthetic */ HotVideoItem(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotVideoItem(Builder builder, boolean z) {
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
            Long l = builder.tid;
            if (l == null) {
                this.tid = DEFAULT_TID;
            } else {
                this.tid = l;
            }
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            String str2 = builder._abstract;
            if (str2 == null) {
                this._abstract = "";
            } else {
                this._abstract = str2;
            }
            String str3 = builder.thumbnail_url;
            if (str3 == null) {
                this.thumbnail_url = "";
            } else {
                this.thumbnail_url = str3;
            }
            String str4 = builder.video_url;
            if (str4 == null) {
                this.video_url = "";
            } else {
                this.video_url = str4;
            }
            String str5 = builder.video_duration;
            if (str5 == null) {
                this.video_duration = "";
            } else {
                this.video_duration = str5;
            }
            String str6 = builder.video_md5;
            if (str6 == null) {
                this.video_md5 = "";
                return;
            } else {
                this.video_md5 = str6;
                return;
            }
        }
        this.tid = builder.tid;
        this.title = builder.title;
        this._abstract = builder._abstract;
        this.thumbnail_url = builder.thumbnail_url;
        this.video_url = builder.video_url;
        this.video_duration = builder.video_duration;
        this.video_md5 = builder.video_md5;
    }
}
