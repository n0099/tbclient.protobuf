package tbclient.ForumTabList;

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
/* loaded from: classes9.dex */
public final class Tab extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_SEQ = "";
    public static final Long DEFAULT_TAB_ID;
    public static final String DEFAULT_TAB_NAME = "";
    public static final Integer DEFAULT_TAB_TYPE;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String seq;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long tab_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String tab_name;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer tab_type;

    /* loaded from: classes9.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<Tab> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String seq;
        public Long tab_id;
        public String tab_name;
        public Integer tab_type;

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
        public Builder(Tab tab) {
            super(tab);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {tab};
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
            if (tab == null) {
                return;
            }
            this.tab_id = tab.tab_id;
            this.tab_name = tab.tab_name;
            this.seq = tab.seq;
            this.tab_type = tab.tab_type;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Tab build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new Tab(this, z, null);
            }
            return (Tab) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(1957618233, "Ltbclient/ForumTabList/Tab;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(1957618233, "Ltbclient/ForumTabList/Tab;");
                return;
            }
        }
        DEFAULT_TAB_ID = 0L;
        DEFAULT_TAB_TYPE = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Tab(Builder builder, boolean z) {
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
            Long l = builder.tab_id;
            if (l == null) {
                this.tab_id = DEFAULT_TAB_ID;
            } else {
                this.tab_id = l;
            }
            String str = builder.tab_name;
            if (str == null) {
                this.tab_name = "";
            } else {
                this.tab_name = str;
            }
            String str2 = builder.seq;
            if (str2 == null) {
                this.seq = "";
            } else {
                this.seq = str2;
            }
            Integer num = builder.tab_type;
            if (num == null) {
                this.tab_type = DEFAULT_TAB_TYPE;
                return;
            } else {
                this.tab_type = num;
                return;
            }
        }
        this.tab_id = builder.tab_id;
        this.tab_name = builder.tab_name;
        this.seq = builder.seq;
        this.tab_type = builder.tab_type;
    }

    public /* synthetic */ Tab(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
