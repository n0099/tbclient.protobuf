package tbclient.Profile;

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
public final class FinanceTab extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_GENERAL_TAB_TEXT = "";
    public static final String DEFAULT_GENERAL_TAB_URL = "";
    public static final List<FinanceTabItems> DEFAULT_TABS;
    public static final String DEFAULT_TITLE = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String general_tab_text;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String general_tab_url;
    @ProtoField(label = Message.Label.REPEATED, tag = 4)
    public final List<FinanceTabItems> tabs;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String title;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<FinanceTab> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String general_tab_text;
        public String general_tab_url;
        public List<FinanceTabItems> tabs;
        public String title;

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
        public Builder(FinanceTab financeTab) {
            super(financeTab);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {financeTab};
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
            if (financeTab == null) {
                return;
            }
            this.title = financeTab.title;
            this.general_tab_text = financeTab.general_tab_text;
            this.general_tab_url = financeTab.general_tab_url;
            this.tabs = Message.copyOf(financeTab.tabs);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FinanceTab build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new FinanceTab(this, z, null) : (FinanceTab) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(778284432, "Ltbclient/Profile/FinanceTab;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(778284432, "Ltbclient/Profile/FinanceTab;");
                return;
            }
        }
        DEFAULT_TABS = Collections.emptyList();
    }

    public /* synthetic */ FinanceTab(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinanceTab(Builder builder, boolean z) {
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
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            String str2 = builder.general_tab_text;
            if (str2 == null) {
                this.general_tab_text = "";
            } else {
                this.general_tab_text = str2;
            }
            String str3 = builder.general_tab_url;
            if (str3 == null) {
                this.general_tab_url = "";
            } else {
                this.general_tab_url = str3;
            }
            List<FinanceTabItems> list = builder.tabs;
            if (list == null) {
                this.tabs = DEFAULT_TABS;
                return;
            } else {
                this.tabs = Message.immutableCopyOf(list);
                return;
            }
        }
        this.title = builder.title;
        this.general_tab_text = builder.general_tab_text;
        this.general_tab_url = builder.general_tab_url;
        this.tabs = Message.immutableCopyOf(builder.tabs);
    }
}
