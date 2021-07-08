package tbclient.RecomVertical;

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
public final class SubClassItem extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Integer DEFAULT_ENABLE;
    public static final String DEFAULT_SUB_CLASS_ICON = "";
    public static final Integer DEFAULT_SUB_CLASS_ID;
    public static final String DEFAULT_SUB_CLASS_NAME = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer enable;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String sub_class_icon;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer sub_class_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String sub_class_name;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<SubClassItem> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer enable;
        public String sub_class_icon;
        public Integer sub_class_id;
        public String sub_class_name;

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
        public Builder(SubClassItem subClassItem) {
            super(subClassItem);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {subClassItem};
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
            if (subClassItem == null) {
                return;
            }
            this.sub_class_id = subClassItem.sub_class_id;
            this.sub_class_name = subClassItem.sub_class_name;
            this.sub_class_icon = subClassItem.sub_class_icon;
            this.enable = subClassItem.enable;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public SubClassItem build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new SubClassItem(this, z, null) : (SubClassItem) invokeZ.objValue;
        }
    }

    /* loaded from: classes9.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(1752769851, "Ltbclient/RecomVertical/SubClassItem;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(1752769851, "Ltbclient/RecomVertical/SubClassItem;");
                return;
            }
        }
        DEFAULT_SUB_CLASS_ID = 0;
        DEFAULT_ENABLE = 0;
    }

    public /* synthetic */ SubClassItem(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubClassItem(Builder builder, boolean z) {
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
            Integer num = builder.sub_class_id;
            if (num == null) {
                this.sub_class_id = DEFAULT_SUB_CLASS_ID;
            } else {
                this.sub_class_id = num;
            }
            String str = builder.sub_class_name;
            if (str == null) {
                this.sub_class_name = "";
            } else {
                this.sub_class_name = str;
            }
            String str2 = builder.sub_class_icon;
            if (str2 == null) {
                this.sub_class_icon = "";
            } else {
                this.sub_class_icon = str2;
            }
            Integer num2 = builder.enable;
            if (num2 == null) {
                this.enable = DEFAULT_ENABLE;
                return;
            } else {
                this.enable = num2;
                return;
            }
        }
        this.sub_class_id = builder.sub_class_id;
        this.sub_class_name = builder.sub_class_name;
        this.sub_class_icon = builder.sub_class_icon;
        this.enable = builder.enable;
    }
}
