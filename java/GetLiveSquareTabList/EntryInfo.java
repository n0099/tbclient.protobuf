package tbclient.GetLiveSquareTabList;

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
public final class EntryInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_BITMAP_WH_RATIO = "";
    public static final String DEFAULT_ICON = "";
    public static final Integer DEFAULT_ICON_TYPE;
    public static final Integer DEFAULT_ID;
    public static final List<String> DEFAULT_LIVE_TAB_TYPE;
    public static final String DEFAULT_NAME = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String bitmap_wh_ratio;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String icon;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer icon_type;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer id;
    @ProtoField(label = Message.Label.REPEATED, tag = 6, type = Message.Datatype.STRING)
    public final List<String> live_tab_type;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String name;

    /* loaded from: classes9.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<EntryInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String bitmap_wh_ratio;
        public String icon;
        public Integer icon_type;
        public Integer id;
        public List<String> live_tab_type;
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
        public Builder(EntryInfo entryInfo) {
            super(entryInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {entryInfo};
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
            if (entryInfo == null) {
                return;
            }
            this.id = entryInfo.id;
            this.name = entryInfo.name;
            this.icon = entryInfo.icon;
            this.bitmap_wh_ratio = entryInfo.bitmap_wh_ratio;
            this.icon_type = entryInfo.icon_type;
            this.live_tab_type = Message.copyOf(entryInfo.live_tab_type);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public EntryInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new EntryInfo(this, z, null);
            }
            return (EntryInfo) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(572121900, "Ltbclient/GetLiveSquareTabList/EntryInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(572121900, "Ltbclient/GetLiveSquareTabList/EntryInfo;");
                return;
            }
        }
        DEFAULT_ID = 0;
        DEFAULT_ICON_TYPE = 0;
        DEFAULT_LIVE_TAB_TYPE = Collections.emptyList();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EntryInfo(Builder builder, boolean z) {
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
            String str = builder.name;
            if (str == null) {
                this.name = "";
            } else {
                this.name = str;
            }
            String str2 = builder.icon;
            if (str2 == null) {
                this.icon = "";
            } else {
                this.icon = str2;
            }
            String str3 = builder.bitmap_wh_ratio;
            if (str3 == null) {
                this.bitmap_wh_ratio = "";
            } else {
                this.bitmap_wh_ratio = str3;
            }
            Integer num2 = builder.icon_type;
            if (num2 == null) {
                this.icon_type = DEFAULT_ICON_TYPE;
            } else {
                this.icon_type = num2;
            }
            List<String> list = builder.live_tab_type;
            if (list == null) {
                this.live_tab_type = DEFAULT_LIVE_TAB_TYPE;
                return;
            } else {
                this.live_tab_type = Message.immutableCopyOf(list);
                return;
            }
        }
        this.id = builder.id;
        this.name = builder.name;
        this.icon = builder.icon;
        this.bitmap_wh_ratio = builder.bitmap_wh_ratio;
        this.icon_type = builder.icon_type;
        this.live_tab_type = Message.immutableCopyOf(builder.live_tab_type);
    }

    public /* synthetic */ EntryInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
