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
/* loaded from: classes5.dex */
public final class HotLiveWithCategory extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_BITMAP_WH_RATIO = "";
    public static final String DEFAULT_ENTRY_NAME = "";
    public static final String DEFAULT_LABEL_NAME = "";
    public static final List<ThreadInfo> DEFAULT_LIVE;
    public static final Integer DEFAULT_LIVE_TAB_TYPE;
    public static final Integer DEFAULT_TAB_ID;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String bitmap_wh_ratio;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String entry_name;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String label_name;
    @ProtoField(label = Message.Label.REPEATED, tag = 4)
    public final List<ThreadInfo> live;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer live_tab_type;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer tab_id;

    /* loaded from: classes5.dex */
    public static final class Builder extends Message.Builder<HotLiveWithCategory> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String bitmap_wh_ratio;
        public String entry_name;
        public String label_name;
        public List<ThreadInfo> live;
        public Integer live_tab_type;
        public Integer tab_id;

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
        public Builder(HotLiveWithCategory hotLiveWithCategory) {
            super(hotLiveWithCategory);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {hotLiveWithCategory};
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
            if (hotLiveWithCategory == null) {
                return;
            }
            this.entry_name = hotLiveWithCategory.entry_name;
            this.tab_id = hotLiveWithCategory.tab_id;
            this.bitmap_wh_ratio = hotLiveWithCategory.bitmap_wh_ratio;
            this.live = Message.copyOf(hotLiveWithCategory.live);
            this.label_name = hotLiveWithCategory.label_name;
            this.live_tab_type = hotLiveWithCategory.live_tab_type;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public HotLiveWithCategory build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new HotLiveWithCategory(this, z, null) : (HotLiveWithCategory) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-67838360, "Ltbclient/HotLiveWithCategory;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-67838360, "Ltbclient/HotLiveWithCategory;");
                return;
            }
        }
        DEFAULT_TAB_ID = 0;
        DEFAULT_LIVE = Collections.emptyList();
        DEFAULT_LIVE_TAB_TYPE = 0;
    }

    public /* synthetic */ HotLiveWithCategory(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotLiveWithCategory(Builder builder, boolean z) {
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
            String str = builder.entry_name;
            if (str == null) {
                this.entry_name = "";
            } else {
                this.entry_name = str;
            }
            Integer num = builder.tab_id;
            if (num == null) {
                this.tab_id = DEFAULT_TAB_ID;
            } else {
                this.tab_id = num;
            }
            String str2 = builder.bitmap_wh_ratio;
            if (str2 == null) {
                this.bitmap_wh_ratio = "";
            } else {
                this.bitmap_wh_ratio = str2;
            }
            List<ThreadInfo> list = builder.live;
            if (list == null) {
                this.live = DEFAULT_LIVE;
            } else {
                this.live = Message.immutableCopyOf(list);
            }
            String str3 = builder.label_name;
            if (str3 == null) {
                this.label_name = "";
            } else {
                this.label_name = str3;
            }
            Integer num2 = builder.live_tab_type;
            if (num2 == null) {
                this.live_tab_type = DEFAULT_LIVE_TAB_TYPE;
                return;
            } else {
                this.live_tab_type = num2;
                return;
            }
        }
        this.entry_name = builder.entry_name;
        this.tab_id = builder.tab_id;
        this.bitmap_wh_ratio = builder.bitmap_wh_ratio;
        this.live = Message.immutableCopyOf(builder.live);
        this.label_name = builder.label_name;
        this.live_tab_type = builder.live_tab_type;
    }
}
