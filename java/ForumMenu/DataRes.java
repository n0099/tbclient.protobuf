package tbclient.ForumMenu;

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
public final class DataRes extends Message {
    public static /* synthetic */ Interceptable $ic;
    public static final Integer DEFAULT_HAS_MENU;
    public static final List<Menu> DEFAULT_PARENT_MENU;
    public static final Integer DEFAULT_UPDATE_TIME;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer has_menu;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<Menu> parent_menu;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer update_time;

    /* loaded from: classes9.dex */
    public /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public final class Builder extends Message.Builder {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer has_menu;
        public List parent_menu;
        public Integer update_time;

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
        public Builder(DataRes dataRes) {
            super(dataRes);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {dataRes};
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
            if (dataRes == null) {
                return;
            }
            this.parent_menu = Message.copyOf(dataRes.parent_menu);
            this.update_time = dataRes.update_time;
            this.has_menu = dataRes.has_menu;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new DataRes(this, z, null);
            }
            return (DataRes) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-1269147650, "Ltbclient/ForumMenu/DataRes;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-1269147650, "Ltbclient/ForumMenu/DataRes;");
                return;
            }
        }
        DEFAULT_PARENT_MENU = Collections.emptyList();
        DEFAULT_UPDATE_TIME = 0;
        DEFAULT_HAS_MENU = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataRes(Builder builder, boolean z) {
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
            List list = builder.parent_menu;
            if (list == null) {
                this.parent_menu = DEFAULT_PARENT_MENU;
            } else {
                this.parent_menu = Message.immutableCopyOf(list);
            }
            Integer num = builder.update_time;
            if (num == null) {
                this.update_time = DEFAULT_UPDATE_TIME;
            } else {
                this.update_time = num;
            }
            Integer num2 = builder.has_menu;
            if (num2 == null) {
                this.has_menu = DEFAULT_HAS_MENU;
                return;
            } else {
                this.has_menu = num2;
                return;
            }
        }
        this.parent_menu = Message.immutableCopyOf(builder.parent_menu);
        this.update_time = builder.update_time;
        this.has_menu = builder.has_menu;
    }

    public /* synthetic */ DataRes(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
