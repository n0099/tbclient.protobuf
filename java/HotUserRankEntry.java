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
public final class HotUserRankEntry extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final List<ShortUserInfo> DEFAULT_HOT_USER;
    public static final Boolean DEFAULT_IS_IN_RANK;
    public static final String DEFAULT_MODULE_ICON = "";
    public static final String DEFAULT_MODULE_NAME = "";
    public static final Integer DEFAULT_TODAY_RANK;
    public static final Integer DEFAULT_YESTERDAY_RANK;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<ShortUserInfo> hot_user;
    @ProtoField(tag = 6, type = Message.Datatype.BOOL)
    public final Boolean is_in_rank;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String module_icon;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String module_name;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer today_rank;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer yesterday_rank;

    /* loaded from: classes5.dex */
    public static final class Builder extends Message.Builder<HotUserRankEntry> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public List<ShortUserInfo> hot_user;
        public Boolean is_in_rank;
        public String module_icon;
        public String module_name;
        public Integer today_rank;
        public Integer yesterday_rank;

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
        public Builder(HotUserRankEntry hotUserRankEntry) {
            super(hotUserRankEntry);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {hotUserRankEntry};
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
            if (hotUserRankEntry == null) {
                return;
            }
            this.hot_user = Message.copyOf(hotUserRankEntry.hot_user);
            this.module_name = hotUserRankEntry.module_name;
            this.module_icon = hotUserRankEntry.module_icon;
            this.today_rank = hotUserRankEntry.today_rank;
            this.yesterday_rank = hotUserRankEntry.yesterday_rank;
            this.is_in_rank = hotUserRankEntry.is_in_rank;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public HotUserRankEntry build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new HotUserRankEntry(this, z, null) : (HotUserRankEntry) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-2086985341, "Ltbclient/HotUserRankEntry;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-2086985341, "Ltbclient/HotUserRankEntry;");
                return;
            }
        }
        DEFAULT_HOT_USER = Collections.emptyList();
        DEFAULT_TODAY_RANK = 0;
        DEFAULT_YESTERDAY_RANK = 0;
        DEFAULT_IS_IN_RANK = Boolean.FALSE;
    }

    public /* synthetic */ HotUserRankEntry(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotUserRankEntry(Builder builder, boolean z) {
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
            List<ShortUserInfo> list = builder.hot_user;
            if (list == null) {
                this.hot_user = DEFAULT_HOT_USER;
            } else {
                this.hot_user = Message.immutableCopyOf(list);
            }
            String str = builder.module_name;
            if (str == null) {
                this.module_name = "";
            } else {
                this.module_name = str;
            }
            String str2 = builder.module_icon;
            if (str2 == null) {
                this.module_icon = "";
            } else {
                this.module_icon = str2;
            }
            Integer num = builder.today_rank;
            if (num == null) {
                this.today_rank = DEFAULT_TODAY_RANK;
            } else {
                this.today_rank = num;
            }
            Integer num2 = builder.yesterday_rank;
            if (num2 == null) {
                this.yesterday_rank = DEFAULT_YESTERDAY_RANK;
            } else {
                this.yesterday_rank = num2;
            }
            Boolean bool = builder.is_in_rank;
            if (bool == null) {
                this.is_in_rank = DEFAULT_IS_IN_RANK;
                return;
            } else {
                this.is_in_rank = bool;
                return;
            }
        }
        this.hot_user = Message.immutableCopyOf(builder.hot_user);
        this.module_name = builder.module_name;
        this.module_icon = builder.module_icon;
        this.today_rank = builder.today_rank;
        this.yesterday_rank = builder.yesterday_rank;
        this.is_in_rank = builder.is_in_rank;
    }
}
