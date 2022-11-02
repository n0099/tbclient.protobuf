package tbclient.Hottopic;

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
public final class PkView extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Integer DEFAULT_HAS_CLICKED;
    public static final String DEFAULT_PK_DESC = "";
    public static final String DEFAULT_PK_ICON = "";
    public static final String DEFAULT_PK_ICON_AFTER = "";
    public static final Integer DEFAULT_PK_INDEX;
    public static final Long DEFAULT_PK_NUM;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer has_clicked;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String pk_desc;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String pk_icon;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String pk_icon_after;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer pk_index;
    @ProtoField(tag = 2, type = Message.Datatype.UINT64)
    public final Long pk_num;

    /* loaded from: classes9.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<PkView> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer has_clicked;
        public String pk_desc;
        public String pk_icon;
        public String pk_icon_after;
        public Integer pk_index;
        public Long pk_num;

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
        public Builder(PkView pkView) {
            super(pkView);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {pkView};
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
            if (pkView == null) {
                return;
            }
            this.pk_desc = pkView.pk_desc;
            this.pk_num = pkView.pk_num;
            this.pk_index = pkView.pk_index;
            this.has_clicked = pkView.has_clicked;
            this.pk_icon = pkView.pk_icon;
            this.pk_icon_after = pkView.pk_icon_after;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PkView build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new PkView(this, z, null);
            }
            return (PkView) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(1446001080, "Ltbclient/Hottopic/PkView;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(1446001080, "Ltbclient/Hottopic/PkView;");
                return;
            }
        }
        DEFAULT_PK_NUM = 0L;
        DEFAULT_PK_INDEX = 0;
        DEFAULT_HAS_CLICKED = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PkView(Builder builder, boolean z) {
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
            String str = builder.pk_desc;
            if (str == null) {
                this.pk_desc = "";
            } else {
                this.pk_desc = str;
            }
            Long l = builder.pk_num;
            if (l == null) {
                this.pk_num = DEFAULT_PK_NUM;
            } else {
                this.pk_num = l;
            }
            Integer num = builder.pk_index;
            if (num == null) {
                this.pk_index = DEFAULT_PK_INDEX;
            } else {
                this.pk_index = num;
            }
            Integer num2 = builder.has_clicked;
            if (num2 == null) {
                this.has_clicked = DEFAULT_HAS_CLICKED;
            } else {
                this.has_clicked = num2;
            }
            String str2 = builder.pk_icon;
            if (str2 == null) {
                this.pk_icon = "";
            } else {
                this.pk_icon = str2;
            }
            String str3 = builder.pk_icon_after;
            if (str3 == null) {
                this.pk_icon_after = "";
                return;
            } else {
                this.pk_icon_after = str3;
                return;
            }
        }
        this.pk_desc = builder.pk_desc;
        this.pk_num = builder.pk_num;
        this.pk_index = builder.pk_index;
        this.has_clicked = builder.has_clicked;
        this.pk_icon = builder.pk_icon;
        this.pk_icon_after = builder.pk_icon_after;
    }

    public /* synthetic */ PkView(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
