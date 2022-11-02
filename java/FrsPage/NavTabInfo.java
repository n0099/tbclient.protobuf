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
import tbclient.FrsTabInfo;
/* loaded from: classes9.dex */
public final class NavTabInfo extends Message {
    public static /* synthetic */ Interceptable $ic;
    public static final List<FrsTabInfo> DEFAULT_HEAD;
    public static final List<FrsTabInfo> DEFAULT_MENU;
    public static final List<FrsTabInfo> DEFAULT_TAB;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<FrsTabInfo> head;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<FrsTabInfo> menu;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<FrsTabInfo> tab;

    /* loaded from: classes9.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<NavTabInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public List<FrsTabInfo> head;
        public List<FrsTabInfo> menu;
        public List<FrsTabInfo> tab;

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
        public Builder(NavTabInfo navTabInfo) {
            super(navTabInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {navTabInfo};
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
            if (navTabInfo == null) {
                return;
            }
            this.tab = Message.copyOf(navTabInfo.tab);
            this.menu = Message.copyOf(navTabInfo.menu);
            this.head = Message.copyOf(navTabInfo.head);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public NavTabInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new NavTabInfo(this, z, null);
            }
            return (NavTabInfo) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(2069084024, "Ltbclient/FrsPage/NavTabInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(2069084024, "Ltbclient/FrsPage/NavTabInfo;");
                return;
            }
        }
        DEFAULT_TAB = Collections.emptyList();
        DEFAULT_MENU = Collections.emptyList();
        DEFAULT_HEAD = Collections.emptyList();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavTabInfo(Builder builder, boolean z) {
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
            List<FrsTabInfo> list = builder.tab;
            if (list == null) {
                this.tab = DEFAULT_TAB;
            } else {
                this.tab = Message.immutableCopyOf(list);
            }
            List<FrsTabInfo> list2 = builder.menu;
            if (list2 == null) {
                this.menu = DEFAULT_MENU;
            } else {
                this.menu = Message.immutableCopyOf(list2);
            }
            List<FrsTabInfo> list3 = builder.head;
            if (list3 == null) {
                this.head = DEFAULT_HEAD;
                return;
            } else {
                this.head = Message.immutableCopyOf(list3);
                return;
            }
        }
        this.tab = Message.immutableCopyOf(builder.tab);
        this.menu = Message.immutableCopyOf(builder.menu);
        this.head = Message.immutableCopyOf(builder.head);
    }

    public /* synthetic */ NavTabInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
