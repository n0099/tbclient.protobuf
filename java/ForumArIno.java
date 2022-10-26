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
/* loaded from: classes9.dex */
public final class ForumArIno extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_ANIMATION_URL = "";
    public static final Integer DEFAULT_AR_ID;
    public static final Integer DEFAULT_AR_TYPE;
    public static final String DEFAULT_SUSPENSION_URL = "";
    public static final Integer DEFAULT_SWITCH;
    public static final String DEFAULT_TITLE = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer _switch;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String animation_url;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer ar_id;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer ar_type;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String suspension_url;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String title;

    /* loaded from: classes9.dex */
    public /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public final class Builder extends Message.Builder {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer _switch;
        public String animation_url;
        public Integer ar_id;
        public Integer ar_type;
        public String suspension_url;
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
        public Builder(ForumArIno forumArIno) {
            super(forumArIno);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {forumArIno};
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
            if (forumArIno == null) {
                return;
            }
            this._switch = forumArIno._switch;
            this.ar_id = forumArIno.ar_id;
            this.ar_type = forumArIno.ar_type;
            this.title = forumArIno.title;
            this.animation_url = forumArIno.animation_url;
            this.suspension_url = forumArIno.suspension_url;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ForumArIno build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new ForumArIno(this, z, null);
            }
            return (ForumArIno) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(450417337, "Ltbclient/ForumArIno;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(450417337, "Ltbclient/ForumArIno;");
                return;
            }
        }
        DEFAULT_SWITCH = 0;
        DEFAULT_AR_ID = 0;
        DEFAULT_AR_TYPE = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ForumArIno(Builder builder, boolean z) {
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
            Integer num = builder._switch;
            if (num == null) {
                this._switch = DEFAULT_SWITCH;
            } else {
                this._switch = num;
            }
            Integer num2 = builder.ar_id;
            if (num2 == null) {
                this.ar_id = DEFAULT_AR_ID;
            } else {
                this.ar_id = num2;
            }
            Integer num3 = builder.ar_type;
            if (num3 == null) {
                this.ar_type = DEFAULT_AR_TYPE;
            } else {
                this.ar_type = num3;
            }
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            String str2 = builder.animation_url;
            if (str2 == null) {
                this.animation_url = "";
            } else {
                this.animation_url = str2;
            }
            String str3 = builder.suspension_url;
            if (str3 == null) {
                this.suspension_url = "";
                return;
            } else {
                this.suspension_url = str3;
                return;
            }
        }
        this._switch = builder._switch;
        this.ar_id = builder.ar_id;
        this.ar_type = builder.ar_type;
        this.title = builder.title;
        this.animation_url = builder.animation_url;
        this.suspension_url = builder.suspension_url;
    }

    public /* synthetic */ ForumArIno(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
