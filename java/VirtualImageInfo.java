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
import java.util.Collections;
import java.util.List;
/* loaded from: classes8.dex */
public final class VirtualImageInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Integer DEFAULT_ALLOW_CUSTOMIZE;
    public static final Integer DEFAULT_IMAGE_AGREE_COUNT;
    public static final Integer DEFAULT_ISSET_VIRTUAL_IMAGE;
    public static final Integer DEFAULT_IS_ALLOW_AGREE;
    public static final Integer DEFAULT_IS_BACKGROUND_FIRSTLY;
    public static final Integer DEFAULT_IS_DISPLAY;
    public static final Integer DEFAULT_RECENT_INCR_AGREE;
    public static final Integer DEFAULT_SNAPSHOOT_ID;
    public static final List<StateInfo> DEFAULT_STATE_LIST;
    public static final String DEFAULT_VIRTUAL_BACKGROUND = "";
    public static final Integer DEFAULT_VIRTUAL_BACKGROUND_TYPE;
    public static final String DEFAULT_VIRTUAL_IMAGE_URL = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 11, type = Message.Datatype.INT32)
    public final Integer allow_customize;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer image_agree_count;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer is_allow_agree;
    @ProtoField(tag = 13, type = Message.Datatype.INT32)
    public final Integer is_background_firstly;
    @ProtoField(tag = 12, type = Message.Datatype.INT32)
    public final Integer is_display;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer isset_virtual_image;
    @ProtoField(tag = 9)
    public final StateInfo personal_state;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer recent_incr_agree;
    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer snapshoot_id;
    @ProtoField(label = Message.Label.REPEATED, tag = 10)
    public final List<StateInfo> state_list;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String virtual_background;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer virtual_background_type;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String virtual_image_url;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<VirtualImageInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer allow_customize;
        public Integer image_agree_count;
        public Integer is_allow_agree;
        public Integer is_background_firstly;
        public Integer is_display;
        public Integer isset_virtual_image;
        public StateInfo personal_state;
        public Integer recent_incr_agree;
        public Integer snapshoot_id;
        public List<StateInfo> state_list;
        public String virtual_background;
        public Integer virtual_background_type;
        public String virtual_image_url;

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
        public Builder(VirtualImageInfo virtualImageInfo) {
            super(virtualImageInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {virtualImageInfo};
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
            if (virtualImageInfo == null) {
                return;
            }
            this.isset_virtual_image = virtualImageInfo.isset_virtual_image;
            this.virtual_image_url = virtualImageInfo.virtual_image_url;
            this.image_agree_count = virtualImageInfo.image_agree_count;
            this.is_allow_agree = virtualImageInfo.is_allow_agree;
            this.virtual_background_type = virtualImageInfo.virtual_background_type;
            this.virtual_background = virtualImageInfo.virtual_background;
            this.recent_incr_agree = virtualImageInfo.recent_incr_agree;
            this.snapshoot_id = virtualImageInfo.snapshoot_id;
            this.personal_state = virtualImageInfo.personal_state;
            this.state_list = Message.copyOf(virtualImageInfo.state_list);
            this.allow_customize = virtualImageInfo.allow_customize;
            this.is_display = virtualImageInfo.is_display;
            this.is_background_firstly = virtualImageInfo.is_background_firstly;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public VirtualImageInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new VirtualImageInfo(this, z, null) : (VirtualImageInfo) invokeZ.objValue;
        }
    }

    /* loaded from: classes8.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(27834995, "Ltbclient/VirtualImageInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(27834995, "Ltbclient/VirtualImageInfo;");
                return;
            }
        }
        DEFAULT_ISSET_VIRTUAL_IMAGE = 0;
        DEFAULT_IMAGE_AGREE_COUNT = 0;
        DEFAULT_IS_ALLOW_AGREE = 0;
        DEFAULT_VIRTUAL_BACKGROUND_TYPE = 0;
        DEFAULT_RECENT_INCR_AGREE = 0;
        DEFAULT_SNAPSHOOT_ID = 0;
        DEFAULT_STATE_LIST = Collections.emptyList();
        DEFAULT_ALLOW_CUSTOMIZE = 0;
        DEFAULT_IS_DISPLAY = 0;
        DEFAULT_IS_BACKGROUND_FIRSTLY = 0;
    }

    public /* synthetic */ VirtualImageInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VirtualImageInfo(Builder builder, boolean z) {
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
            Integer num = builder.isset_virtual_image;
            if (num == null) {
                this.isset_virtual_image = DEFAULT_ISSET_VIRTUAL_IMAGE;
            } else {
                this.isset_virtual_image = num;
            }
            String str = builder.virtual_image_url;
            if (str == null) {
                this.virtual_image_url = "";
            } else {
                this.virtual_image_url = str;
            }
            Integer num2 = builder.image_agree_count;
            if (num2 == null) {
                this.image_agree_count = DEFAULT_IMAGE_AGREE_COUNT;
            } else {
                this.image_agree_count = num2;
            }
            Integer num3 = builder.is_allow_agree;
            if (num3 == null) {
                this.is_allow_agree = DEFAULT_IS_ALLOW_AGREE;
            } else {
                this.is_allow_agree = num3;
            }
            Integer num4 = builder.virtual_background_type;
            if (num4 == null) {
                this.virtual_background_type = DEFAULT_VIRTUAL_BACKGROUND_TYPE;
            } else {
                this.virtual_background_type = num4;
            }
            String str2 = builder.virtual_background;
            if (str2 == null) {
                this.virtual_background = "";
            } else {
                this.virtual_background = str2;
            }
            Integer num5 = builder.recent_incr_agree;
            if (num5 == null) {
                this.recent_incr_agree = DEFAULT_RECENT_INCR_AGREE;
            } else {
                this.recent_incr_agree = num5;
            }
            Integer num6 = builder.snapshoot_id;
            if (num6 == null) {
                this.snapshoot_id = DEFAULT_SNAPSHOOT_ID;
            } else {
                this.snapshoot_id = num6;
            }
            this.personal_state = builder.personal_state;
            List<StateInfo> list = builder.state_list;
            if (list == null) {
                this.state_list = DEFAULT_STATE_LIST;
            } else {
                this.state_list = Message.immutableCopyOf(list);
            }
            Integer num7 = builder.allow_customize;
            if (num7 == null) {
                this.allow_customize = DEFAULT_ALLOW_CUSTOMIZE;
            } else {
                this.allow_customize = num7;
            }
            Integer num8 = builder.is_display;
            if (num8 == null) {
                this.is_display = DEFAULT_IS_DISPLAY;
            } else {
                this.is_display = num8;
            }
            Integer num9 = builder.is_background_firstly;
            if (num9 == null) {
                this.is_background_firstly = DEFAULT_IS_BACKGROUND_FIRSTLY;
                return;
            } else {
                this.is_background_firstly = num9;
                return;
            }
        }
        this.isset_virtual_image = builder.isset_virtual_image;
        this.virtual_image_url = builder.virtual_image_url;
        this.image_agree_count = builder.image_agree_count;
        this.is_allow_agree = builder.is_allow_agree;
        this.virtual_background_type = builder.virtual_background_type;
        this.virtual_background = builder.virtual_background;
        this.recent_incr_agree = builder.recent_incr_agree;
        this.snapshoot_id = builder.snapshoot_id;
        this.personal_state = builder.personal_state;
        this.state_list = Message.immutableCopyOf(builder.state_list);
        this.allow_customize = builder.allow_customize;
        this.is_display = builder.is_display;
        this.is_background_firstly = builder.is_background_firstly;
    }
}
