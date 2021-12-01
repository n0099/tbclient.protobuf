package tbclient;

import com.baidu.android.imsdk.internal.Constants;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InitContext;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.baidu.titan.sdk.runtime.TitanRuntime;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes4.dex */
public final class ItemThemeColorElement extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_BOTTOM_COLOR = "";
    public static final String DEFAULT_EDIT_BUTTON_COLOR = "";
    public static final String DEFAULT_TOP_COLOR = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String bottom_color;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String edit_button_color;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String top_color;

    /* loaded from: classes4.dex */
    public static final class Builder extends Message.Builder<ItemThemeColorElement> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String bottom_color;
        public String edit_button_color;
        public String top_color;

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
        public Builder(ItemThemeColorElement itemThemeColorElement) {
            super(itemThemeColorElement);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {itemThemeColorElement};
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
            if (itemThemeColorElement == null) {
                return;
            }
            this.top_color = itemThemeColorElement.top_color;
            this.bottom_color = itemThemeColorElement.bottom_color;
            this.edit_button_color = itemThemeColorElement.edit_button_color;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ItemThemeColorElement build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new ItemThemeColorElement(this, z, null) : (ItemThemeColorElement) invokeZ.objValue;
        }
    }

    /* loaded from: classes4.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    public /* synthetic */ ItemThemeColorElement(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ItemThemeColorElement(Builder builder, boolean z) {
        super(builder);
        Interceptable interceptable = $ic;
        if (interceptable != null) {
            InitContext newInitContext = TitanRuntime.newInitContext();
            newInitContext.initArgs = r2;
            Object[] objArr = {builder, Boolean.valueOf(z)};
            interceptable.invokeUnInit(65536, newInitContext);
            int i2 = newInitContext.flag;
            if ((i2 & 1) != 0) {
                int i3 = i2 & 2;
                super((Message.Builder) newInitContext.callArgs[0]);
                newInitContext.thisArg = this;
                interceptable.invokeInitBody(65536, newInitContext);
                return;
            }
        }
        if (z) {
            String str = builder.top_color;
            if (str == null) {
                this.top_color = "";
            } else {
                this.top_color = str;
            }
            String str2 = builder.bottom_color;
            if (str2 == null) {
                this.bottom_color = "";
            } else {
                this.bottom_color = str2;
            }
            String str3 = builder.edit_button_color;
            if (str3 == null) {
                this.edit_button_color = "";
                return;
            } else {
                this.edit_button_color = str3;
                return;
            }
        }
        this.top_color = builder.top_color;
        this.bottom_color = builder.bottom_color;
        this.edit_button_color = builder.edit_button_color;
    }
}
